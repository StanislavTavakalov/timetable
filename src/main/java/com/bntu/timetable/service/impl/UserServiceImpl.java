package com.bntu.timetable.service.impl;

import com.bntu.timetable.dto.RegistrationRequest;
import com.bntu.timetable.entity.RegistrationToken;
import com.bntu.timetable.entity.Role;
import com.bntu.timetable.entity.Status;
import com.bntu.timetable.entity.User;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.RegistrationTokenRepository;
import com.bntu.timetable.repository.RoleRepository;
import com.bntu.timetable.repository.UserRepository;
import com.bntu.timetable.service.EmailService;
import com.bntu.timetable.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;


@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final EmailService emailService;
    private final RegistrationTokenRepository registrationTokenRepository;

    @Value("${default.password}")
    private String defaultPassword;

    // Time in minutes
    private final static int EXPIRATION_TIME = 24 * 60;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder,
                           EmailService emailService, RegistrationTokenRepository registrationTokenRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.emailService = emailService;
        this.registrationTokenRepository = registrationTokenRepository;
    }

    @Override
    public User findById(UUID userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElse(null);
    }

    @Override
    public User register(RegistrationRequest registrationRequest) {
        if (isEmailAlreadyInUse(registrationRequest.getEmail())) {
            throw new RuntimeException(ErrorMessage.EMAIL_IS_ALREADY_EXIST);
        }
        User user = createUser(registrationRequest);
        User registeredUser = userRepository.save(user);
        log.info("User {} was successfully registered", registeredUser);

        RegistrationToken token = createTokenForUser(user);
        emailService.sendAccountActivationEmail(token.getId().toString(), user);

        return registeredUser;
    }

    private boolean isEmailAlreadyInUse(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.isPresent();
    }

    private User createUser(RegistrationRequest registrationRequest) {
        User user = new User();
        user.setEmail(registrationRequest.getEmail());
        user.setStatus(Status.NOT_ACTIVE);
        user.setRole(registrationRequest.getRole());
        user.setFirstName(registrationRequest.getFirstName());
        user.setLastName(registrationRequest.getLastName());
        user.setPatronymic(registrationRequest.getPatronymic());
        user.setCreatedWhen(new Date());
        user.setUpdatedWhen(new Date());
        user.setPassword(passwordEncoder.encode(defaultPassword));
        return user;
    }

    private RegistrationToken createTokenForUser(User user) {
        RegistrationToken token = new RegistrationToken();
        token.setId(user.getId());
        token.setExpiryDate(calculateExpiryDate());
        registrationTokenRepository.save(token);
        return token;
    }

    private Date calculateExpiryDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, UserServiceImpl.EXPIRATION_TIME);
        return new Date(cal.getTime().getTime());
    }

    // TODO: change to "USER"
    private Role getDefaultRole() {
        return roleRepository.findByName("ADMIN");
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        if (registrationTokenRepository.findById(id).isPresent()) {
            registrationTokenRepository.deleteById(id);
        }
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
        } else {
            throw new RuntimeException(ErrorMessage.USER_NOT_FOUND + id);
        }
    }

    @Override
    public void verifyUser(UUID id) {
        Optional<RegistrationToken> registrationToken = registrationTokenRepository.findById(id);
        if (registrationToken.isEmpty()) {
            throw new RuntimeException(ErrorMessage.REGISTRATION_TOKEN_NOT_FOUND + id);
        }

        Calendar cal = Calendar.getInstance();
        if ((registrationToken.get().getExpiryDate()
                .getTime() - cal.getTime()
                .getTime()) <= 0) {
            throw new RuntimeException(ErrorMessage.TOKEN_EXPIRED + id);
        }

        registrationTokenRepository.deleteById(id);

        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            user.get().setStatus(Status.ACTIVE);
            userRepository.save(user.get());
        } else {
            throw new RuntimeException(ErrorMessage.USER_NOT_FOUND + id);
        }
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User userToUpdate) {
        User user = getUserById(userToUpdate.getId());
        user.setEmail(userToUpdate.getEmail());
        user.setLastName(userToUpdate.getLastName());
        user.setPatronymic(userToUpdate.getPatronymic());
        user.setFirstName(userToUpdate.getFirstName());
        user.setRole(userToUpdate.getRole());
        user.setUpdatedWhen(new Date());
        return userRepository.save(user);
    }

    @Override
    public User changeStatus(UUID id, boolean isNeedToBlock) {
        User user = getUserById(id);
        if (isNeedToBlock) {
            user.setStatus(Status.BLOCKED);
        } else {
            user.setStatus(Status.ACTIVE);
        }
        user.setUpdatedWhen(new Date());
        return userRepository.save(user);
    }

    private User getUserById(UUID id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new RuntimeException(ErrorMessage.USER_NOT_FOUND + id);
        }
        return user.get();
    }


}

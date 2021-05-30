package com.bntu.timetable.service.impl;

import com.bntu.timetable.dto.RegistrationRequest;
import com.bntu.timetable.entity.Role;
import com.bntu.timetable.entity.Status;
import com.bntu.timetable.entity.User;
import com.bntu.timetable.repository.RoleRepository;
import com.bntu.timetable.repository.UserRepository;
import com.bntu.timetable.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findById(UUID userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElse(null);
    }

    @Override
    public User register(RegistrationRequest registrationRequest) {
        User user = new User();
        user.setUsername(registrationRequest.getEmail());
        user.setEmail(registrationRequest.getEmail());
        user.setStatus(Status.ACTIVE);
        user.setRole(getDefaultRole());
        user.setFirstName(registrationRequest.getFirstName());
        user.setLastName(registrationRequest.getLastName());
        user.setPatronymic(registrationRequest.getPatronymic());
        user.setCreatedWhen(new Date());
        user.setUpdatedWhen(new Date());
        user.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));

        User registeredUser = userRepository.save(user);
        log.info("User {} was successfully registered", registeredUser);

        return registeredUser;
    }

    private Role getDefaultRole() {
        return roleRepository.findByName("ADMIN");
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        userRepository.deleteById(id);
    }
}

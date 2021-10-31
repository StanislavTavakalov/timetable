package com.bntu.timetable.controller;

import com.bntu.timetable.converters.UserConverter;
import com.bntu.timetable.dto.AuthenticationRequest;
import com.bntu.timetable.dto.RegistrationRequest;
import com.bntu.timetable.entity.User;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.UserRepository;
import com.bntu.timetable.security.JwtTokenProvider;
import com.bntu.timetable.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSendException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private JwtTokenProvider jwtTokenProvider;
    private UserService userService;

    public AuthController(AuthenticationManager authenticationManager, UserRepository userRepository, JwtTokenProvider jwtTokenProvider, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest request) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
            User user = userRepository.findByEmail(request.getEmail()).orElseThrow(() -> new UsernameNotFoundException("User doesn't exists"));
            String token = jwtTokenProvider.createToken(request.getEmail(), user.getRole().getName());
            Map<Object, Object> response = new HashMap<>();
            response.put("user", UserConverter.convertUserToDto(user));
            response.put("token", token);
            return ResponseEntity.ok(response);
        } catch (LockedException e) {
            return new ResponseEntity<>(ErrorMessage.USER_NOT_ACTIVE, HttpStatus.FORBIDDEN);
        } catch (AuthenticationException e) {
            return new ResponseEntity<>(ErrorMessage.INVALID_CREDENTIALS, HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegistrationRequest registrationRequest) {
        try {
            return ResponseEntity.ok(userService.register(registrationRequest));
        } catch (MailSendException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();
        securityContextLogoutHandler.logout(request, response, null);
    }
}

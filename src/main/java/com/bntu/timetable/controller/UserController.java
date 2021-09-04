package com.bntu.timetable.controller;


import com.bntu.timetable.entity.User;
import com.bntu.timetable.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/users")
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('users:read')")
    public User getUser(@PathVariable UUID id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('users:delete')")
    public ResponseEntity<?> deleteUser(@PathVariable UUID id) {
        try {
            log.debug("Delete user with Id: {}", id);
            userService.delete(id);
            log.debug("User was deleted");
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/verifyUser")
    public ResponseEntity<?> verifyUser(@RequestParam("id") String id) {
        try {
            log.debug("Verify user with Id: {}", id);
            userService.verifyUser(UUID.fromString(id));
            log.debug("User activation was completed");
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}

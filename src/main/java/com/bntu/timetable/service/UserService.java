package com.bntu.timetable.service;

import com.bntu.timetable.dto.RegistrationRequest;
import com.bntu.timetable.entity.User;
import java.util.List;
import java.util.UUID;

public interface UserService {
    User findById(UUID id);

    User register(RegistrationRequest registrationRequest);

    User findByUsername(String username);

    List<User> getAll();

    void delete(UUID id);
}

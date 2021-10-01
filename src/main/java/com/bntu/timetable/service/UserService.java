package com.bntu.timetable.service;

import com.bntu.timetable.dto.RegistrationRequest;
import com.bntu.timetable.entity.User;
import java.util.List;
import java.util.UUID;

public interface UserService {
    User findById(UUID id);

    User register(RegistrationRequest registrationRequest);

    List<User> getAll();

    void delete(UUID id);

    void verifyUser(UUID id);

    List<User> getUsers();

    User updateUser(User user);

    User changeStatus(UUID id, boolean isNeedToBlock);
}

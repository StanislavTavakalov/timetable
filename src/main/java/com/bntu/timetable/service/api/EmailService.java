package com.bntu.timetable.service.api;

import com.bntu.timetable.entity.user.User;

public interface EmailService {
    void sendAccountActivationEmail(String tokenId, User user);
}

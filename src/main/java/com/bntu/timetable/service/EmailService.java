package com.bntu.timetable.service;

import com.bntu.timetable.entity.User;

public interface EmailService {
    void sendAccountActivationEmail(String tokenId, User user);
}

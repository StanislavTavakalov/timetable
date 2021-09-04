package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.User;
import com.bntu.timetable.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailServiceImpl implements EmailService {

    private static final String accountActivationMessage =
            "<html> To complete your account set-up, click this link: \n <a href=http://localhost:8080/api/v1/users/verifyUser?id=";
    private static final String accountActivationTitle = "Verify registration ";
    private static final String htmlMessageEnd = "> Verify </a>  </html>";

    @Value("${spring.mail.username}")
    private String timetableEmailAddress;

    private final JavaMailSender javaMailSender;

    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendAccountActivationEmail(String tokenId, User user) {
        log.debug("Sending email to: {}", user.getEmail());
        javaMailSender.send(constructEmail(accountActivationMessage + tokenId + htmlMessageEnd, user));
    }

    private SimpleMailMessage constructEmail(String body, User user) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setSubject(EmailServiceImpl.accountActivationTitle);
        email.setText(body);
        email.setTo(user.getEmail());
        email.setFrom(timetableEmailAddress);
        return email;
    }
}
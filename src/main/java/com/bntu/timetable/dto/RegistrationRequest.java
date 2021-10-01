package com.bntu.timetable.dto;

import com.bntu.timetable.entity.Role;
import lombok.Data;

@Data
public class RegistrationRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Role role;
}

package com.bntu.timetable.converters;


import com.bntu.timetable.dto.DeaneryShortDto;
import com.bntu.timetable.dto.DepartmentShortDto;
import com.bntu.timetable.dto.UserDto;
import com.bntu.timetable.entity.User;

import java.util.List;
import java.util.stream.Collectors;


public class UserConverter {

    public static UserDto convertUserToDto(User user) {
        UserDto userDto = new UserDto();

        if (user.getDeanery() != null) {
            DeaneryShortDto deaneryShortDto = new DeaneryShortDto();
            deaneryShortDto.setId(user.getDeanery().getId());
            deaneryShortDto.setFullName(user.getDeanery().getFullName());
            deaneryShortDto.setShortname(user.getDeanery().getShortName());
            userDto.setDeanery(deaneryShortDto);
        }

        if (user.getDepartment() != null) {
            DepartmentShortDto departmentShortDto = new DepartmentShortDto();
            departmentShortDto.setId(user.getDepartment().getId());
            departmentShortDto.setFullName(user.getDepartment().getFullName());
            departmentShortDto.setShortname(user.getDepartment().getShortName());
            userDto.setDepartment(departmentShortDto);
        }

        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setPatronymic(user.getPatronymic());
        userDto.setRole(user.getRole());
        userDto.setStatus(user.getStatus());

        return userDto;
    }

    public static List<UserDto> convertUsersToDto(List<User> users) {
        return users.stream().map(UserConverter::convertUserToDto).collect(Collectors.toList());
    }
}

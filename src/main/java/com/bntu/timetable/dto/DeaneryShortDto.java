package com.bntu.timetable.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class DeaneryShortDto {

    UUID id;

    String fullName;

    String shortname;

}

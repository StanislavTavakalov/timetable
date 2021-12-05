package com.bntu.timetable.dto;

import lombok.Data;

@Data
public class BuildingCreateRequest {
    private String number;
    private int floorsNumber;
    private String description;
}

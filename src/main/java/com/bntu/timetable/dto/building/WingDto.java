package com.bntu.timetable.dto.building;

import com.bntu.timetable.entity.Classroom;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class WingDto {

    private UUID id;

    private String name;

    private List<Classroom> classrooms;

    private UUID floorId;

}

package com.bntu.timetable.service;

import com.bntu.timetable.entity.Classroom;
import com.bntu.timetable.entity.ClassroomType;

import java.util.List;
import java.util.UUID;

public interface ClassroomService {

    Classroom createClassroom (Classroom classroom);

    Classroom updateClassroom (Classroom classroom);

    Classroom getClassroom(UUID id);

    void deleteClassroom(UUID id);

    List<Classroom> getClassrooms();
}

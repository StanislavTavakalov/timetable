package com.bntu.timetable.service;

import com.bntu.timetable.entity.TeacherPosition;

import java.util.List;
import java.util.UUID;

public interface TeacherPositionService {

    TeacherPosition getTeacherPosition(UUID id);

    List<TeacherPosition> getTeacherPositions();

    TeacherPosition createTeacherPosition(TeacherPosition teacherPosition);

    TeacherPosition updateTeacherPosition(TeacherPosition teacherPosition);

    void deleteTeacherPosition(UUID id);
}

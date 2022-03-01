package com.bntu.timetable.service;

import com.bntu.timetable.dto.InfoForTeacherCreation;
import com.bntu.timetable.entity.Teacher;

import java.util.List;
import java.util.UUID;

public interface TeacherService {

    Teacher getTeacher(UUID id);

    List<Teacher> getTeachers();

    Teacher createTeacher(Teacher teacher);

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacher(UUID id);

    InfoForTeacherCreation loadDataForTeacherCreation();
}

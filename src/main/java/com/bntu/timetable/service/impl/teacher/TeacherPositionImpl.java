package com.bntu.timetable.service.impl.teacher;

import com.bntu.timetable.entity.teacher.TeacherPosition;
import com.bntu.timetable.repository.teacher.TeacherPositionRepository;
import com.bntu.timetable.service.api.teacher.TeacherPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeacherPositionImpl implements TeacherPositionService {

    @Autowired
    private TeacherPositionRepository teacherPositionRepository;


    @Override
    public TeacherPosition getTeacherPosition(UUID id) {
        return null;
    }

    @Override
    public List<TeacherPosition> getTeacherPositions() {
        return teacherPositionRepository.findAll();
    }

    @Override
    public TeacherPosition createTeacherPosition(TeacherPosition teacherPosition) {
        return null;
    }

    @Override
    public TeacherPosition updateTeacherPosition(TeacherPosition teacherPosition) {
        return null;
    }

    @Override
    public void deleteTeacherPosition(UUID id) {

    }
}

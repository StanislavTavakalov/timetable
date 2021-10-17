package com.bntu.timetable.service.impl;


import com.bntu.timetable.entity.Building;
import com.bntu.timetable.entity.Classroom;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.ClassroomRepository;
import com.bntu.timetable.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.UUID;


public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public Classroom createClassroom(Classroom classroom) {
        classroom.setCreatedWhen(new Date());
        classroom.setUpdatedWhen(new Date());
        return classroomRepository.save(classroom);
    }

    @Override
    public Classroom updateClassroom(Classroom classroom) {
        classroom.setUpdatedWhen(new Date());
        return classroomRepository.save(classroom);
    }

    @Override
    public Classroom getClassroom(UUID id) {
        return getClassroomById(id);
    }

    @Override
    public void deleteClassroom(UUID id) {
        classroomRepository.deleteById(id);
    }

    @Override
    public List<Classroom> getClassrooms() {
        return classroomRepository.findAll();
    }

    private Classroom getClassroomById(UUID id) {
        Classroom classroom = classroomRepository.findById(id).orElse(null);
        if (classroom == null) {
            throw new RuntimeException(ErrorMessage.CLASSROOM_NOT_FOUND);
        }
        return classroom;
    }
}

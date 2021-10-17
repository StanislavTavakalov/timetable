package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.ClassroomType;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.ClassroomTypeRepository;
import com.bntu.timetable.service.ClassroomTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ClassroomTypeServiceImpl implements ClassroomTypeService {
    @Autowired
    private ClassroomTypeRepository classroomTypeRepository;

    @Override
    public ClassroomType createClassroomType(ClassroomType classroomType) {
        classroomType.setCreatedWhen(new Date());
        classroomType.setUpdatedWhen(new Date());
        return classroomTypeRepository.save(classroomType);
    }

    @Override
    public ClassroomType updateClassroomType(ClassroomType classroomType) {
        classroomType.setUpdatedWhen(new Date());
        return classroomTypeRepository.save(classroomType);
    }

    @Override
    public ClassroomType getClassroomType(UUID id) {
        return getClassroomTypeById(id);
    }

    @Override
    public void deleteClassroomType(UUID id) {
        classroomTypeRepository.deleteById(id);
    }

    @Override
    public List<ClassroomType> getClassroomTypes() {
        return classroomTypeRepository.findAll();
    }


    private ClassroomType getClassroomTypeById(UUID id) {
        ClassroomType classroomType = classroomTypeRepository.findById(id).orElse(null);
        if (classroomType == null) {
            throw new RuntimeException(ErrorMessage.CLASSROOM_TYPE_NOT_FOUND);
        }
        return classroomType;
    }

}

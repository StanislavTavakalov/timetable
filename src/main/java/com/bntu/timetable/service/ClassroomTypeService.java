package com.bntu.timetable.service;

import com.bntu.timetable.entity.ClassroomType;


import java.util.List;
import java.util.UUID;

public interface ClassroomTypeService {

    ClassroomType createClassroomType(ClassroomType classroomType);

    ClassroomType updateClassroomType(ClassroomType classroomType);

    ClassroomType getClassroomType(UUID id);

    void deleteClassroomType(UUID id);

    List<ClassroomType> getClassroomTypes();

}

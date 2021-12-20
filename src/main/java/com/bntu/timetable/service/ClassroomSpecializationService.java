package com.bntu.timetable.service;


import com.bntu.timetable.entity.ClassroomSpecialization;

import java.util.List;
import java.util.UUID;

public interface ClassroomSpecializationService {

    ClassroomSpecialization createClassroomSpecialization(ClassroomSpecialization classroomSpecialization);

    ClassroomSpecialization updateClassroomSpecialization(ClassroomSpecialization classroomSpecialization);

    ClassroomSpecialization getClassroomSpecialization(UUID id);

    void deleteClassroomSpecialization(UUID id);

    List<ClassroomSpecialization> getClassroomSpecializations();


}

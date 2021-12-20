package com.bntu.timetable.repository;


import com.bntu.timetable.entity.ClassroomSpecialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClassroomSpecializationRepository extends JpaRepository<ClassroomSpecialization, UUID> {
}

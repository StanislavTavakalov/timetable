package com.bntu.timetable.repository;

import com.bntu.timetable.entity.ClassroomType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClassroomTypeRepository extends JpaRepository<ClassroomType, UUID> {
}

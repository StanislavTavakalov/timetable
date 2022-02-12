package com.bntu.timetable.repository;

import com.bntu.timetable.entity.TeacherPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherPositionRepository extends JpaRepository<TeacherPosition, UUID> {
}

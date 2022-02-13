package com.bntu.timetable.repository;

import com.bntu.timetable.entity.AcademicDegree;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AcademicDegreeRepository extends JpaRepository<AcademicDegree, UUID> {
}

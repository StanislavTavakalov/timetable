package com.bntu.timetable.repository;

import com.bntu.timetable.entity.AcademicTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AcademicTitleRepository extends JpaRepository<AcademicTitle, UUID> {
}

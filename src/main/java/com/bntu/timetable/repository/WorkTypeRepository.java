package com.bntu.timetable.repository;

import com.bntu.timetable.entity.WorkType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkTypeRepository extends JpaRepository<WorkType, UUID> {
}

package com.bntu.timetable.repository;

import com.bntu.timetable.entity.ClassroomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClassroomTypeRepository extends JpaRepository<ClassroomType, UUID> {
}

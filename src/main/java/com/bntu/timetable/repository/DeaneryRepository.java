package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Deanery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeaneryRepository extends JpaRepository<Deanery, UUID> {
}

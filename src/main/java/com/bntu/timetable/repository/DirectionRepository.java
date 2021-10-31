package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DirectionRepository extends JpaRepository<Direction, UUID> {
}

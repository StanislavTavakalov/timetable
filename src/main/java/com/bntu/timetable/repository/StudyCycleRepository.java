package com.bntu.timetable.repository;

import com.bntu.timetable.entity.studyplan.discipline.StudyCycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudyCycleRepository extends JpaRepository<StudyCycle, UUID> {
}

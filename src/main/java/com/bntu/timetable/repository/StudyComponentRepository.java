package com.bntu.timetable.repository;

import com.bntu.timetable.entity.studyplan.discipline.StudyComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudyComponentRepository extends JpaRepository<StudyComponent, UUID> {
}

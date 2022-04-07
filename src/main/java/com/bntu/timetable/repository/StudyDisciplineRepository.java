package com.bntu.timetable.repository;

import com.bntu.timetable.entity.studyplan.structure.StudyDiscipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudyDisciplineRepository extends JpaRepository<StudyDiscipline, UUID> {
}

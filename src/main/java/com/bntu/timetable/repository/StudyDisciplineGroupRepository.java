package com.bntu.timetable.repository;

import com.bntu.timetable.entity.studyplan.structure.StudyDisciplineGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudyDisciplineGroupRepository extends JpaRepository<StudyDisciplineGroup, UUID> {
}

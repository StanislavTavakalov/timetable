package com.bntu.timetable.repository.studyplan;

import com.bntu.timetable.entity.studyplan.StudyPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudyPlanRepository extends JpaRepository<StudyPlan, UUID> {


}

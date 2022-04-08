package com.bntu.timetable.service.api.studyplan;

import com.bntu.timetable.entity.studyplan.StudyPlan;

import java.util.List;
import java.util.UUID;

public interface StudyPlanService {

    StudyPlan getStudyPlan(UUID id);

    List<StudyPlan> getStudyPlans();

    StudyPlan createStudyPlan(StudyPlan studyPlan);

    StudyPlan updateStudyPlan(StudyPlan studyPlan);

    void deleteStudyPlan(UUID id);

}

package com.bntu.timetable.service.impl.studyplan;

import com.bntu.timetable.entity.studyplan.StudyPlan;
import com.bntu.timetable.repository.studyplan.StudyPlanRepository;
import com.bntu.timetable.service.api.studyplan.StudyPlanService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudyPlanServiceImpl implements StudyPlanService {

    @Autowired
    private StudyPlanRepository studyPlanRepository;

    @Override
    public StudyPlan getStudyPlan(UUID id) {
        return studyPlanRepository.findById(id).orElse(null);
    }

    @Override
    public List<StudyPlan> getStudyPlans() {
        return studyPlanRepository.findAll();
    }

    @Override
    public StudyPlan createStudyPlan(StudyPlan studyPlan) {
        return studyPlanRepository.save(studyPlan);
    }

    @Override
    public StudyPlan updateStudyPlan(StudyPlan studyPlan) {
        return studyPlanRepository.save(studyPlan);
    }

    @Override
    public void deleteStudyPlan(UUID id) {
        studyPlanRepository.deleteById(id);
    }
}

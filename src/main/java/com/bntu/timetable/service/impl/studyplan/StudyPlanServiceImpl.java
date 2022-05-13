package com.bntu.timetable.service.impl.studyplan;

import com.bntu.timetable.dto.CommonInfoForStudyPlan;
import com.bntu.timetable.entity.studyplan.StudyPlan;
import com.bntu.timetable.entity.studyplan.StudyPlanStatus;
import com.bntu.timetable.entity.studyplan.structure.Component;
import com.bntu.timetable.entity.studyplan.structure.Cycle;
import com.bntu.timetable.entity.studyplan.structure.Discipline;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.studyplan.StudyPlanRepository;
import com.bntu.timetable.service.api.QualificationService;
import com.bntu.timetable.service.api.department.SpecialityService;
import com.bntu.timetable.service.api.discipline.DisciplineService;
import com.bntu.timetable.service.api.studyplan.ActivityService;
import com.bntu.timetable.service.api.studyplan.StudyPlanService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudyPlanServiceImpl implements StudyPlanService {

    @Autowired
    private StudyPlanRepository studyPlanRepository;

    @Autowired
    private SpecialityService specialityService;

    @Autowired
    private QualificationService qualificationService;

    @Autowired
    private ActivityService activityService;

    @Autowired
    private DisciplineService disciplineService;

    @Override
    public StudyPlan getStudyPlan(UUID id) {
        StudyPlan studyPlan = studyPlanRepository.findById(id).orElse(null);
        if (studyPlan != null) {
            alignAllObjectsByPositionNumber(studyPlan);
        }
        return studyPlanRepository.findById(id).orElse(null);
    }

    private void alignAllObjectsByPositionNumber(StudyPlan studyPlan) {

        studyPlan.getCycles().sort(new Comparator<Cycle>() {
            @Override
            public int compare(Cycle u1, Cycle u2) {
                return u1.getPosition().compareTo(u2.getPosition());
            }
        });

        for (Cycle cycle : studyPlan.getCycles()) {
            cycle.getComponents().sort(new Comparator<Component>() {
                @Override
                public int compare(Component u1, Component u2) {
                    return u1.getPosition().compareTo(u2.getPosition());
                }
            });
            cycle.getDisciplines().sort(new Comparator<Discipline>() {
                @Override
                public int compare(Discipline u1, Discipline u2) {
                    return u1.getPosition().compareTo(u2.getPosition());
                }
            });
            for (Component component : cycle.getComponents()) {
                component.getDisciplines().sort(new Comparator<Discipline>() {
                    @Override
                    public int compare(Discipline u1, Discipline u2) {
                        return u1.getPosition().compareTo(u2.getPosition());
                    }
                });
            }
        }
    }

    @Override
    public List<StudyPlan> getStudyPlans() {
        List<StudyPlan> studyPlans = studyPlanRepository.findAll();
        studyPlans.forEach(this::alignAllObjectsByPositionNumber);
        return studyPlans;
    }

    @Override
    public StudyPlan createStudyPlan(StudyPlan studyPlan) {
        fillReferences(studyPlan);
        return studyPlanRepository.save(studyPlan);
    }

    private void fillReferences(StudyPlan studyPlan) {
        studyPlan.getEducationalSchedule().getEducationalScheduleTotalActivities()
                .forEach(totalActivity -> totalActivity.setEducationalSchedule(studyPlan.
                        getEducationalSchedule()));

        studyPlan.getCycles().forEach(cycle -> {
            cycle.setStudyPlan(studyPlan);

            cycle.getComponents().forEach(component -> {
                component.setCycle(cycle);
                component.getDisciplines().forEach(discipline -> discipline.setComponent(component));
            });

            cycle.getDisciplines().forEach(discipline -> discipline.setCycle(cycle));
        });
    }

    @Override
    public StudyPlan updateStudyPlan(StudyPlan studyPlan) {
        fillReferences(studyPlan);
        return studyPlanRepository.save(studyPlan);
    }

    @Override
    public void deleteStudyPlan(UUID id) {
        studyPlanRepository.deleteById(id);
    }

    @Override
    public CommonInfoForStudyPlan loadCommonInfo() {
        CommonInfoForStudyPlan commonInfo = new CommonInfoForStudyPlan();
        commonInfo.setQualifications(qualificationService.getQualifications());
        commonInfo.setSpecialities(specialityService.getSpecialities());
        commonInfo.setActivities(activityService.getActivities());
        commonInfo.setDisciplines(disciplineService.getDisciplineTemplates());
        return commonInfo;
    }

    @Override
    public StudyPlan submitStudyPlan(UUID id) {
        Optional<StudyPlan> studyPlan = this.studyPlanRepository.findById(id);
        if (studyPlan.isPresent()) {
            studyPlan.get().setStatus(StudyPlanStatus.SUBMITTED);
            return this.studyPlanRepository.save(studyPlan.get());
        } else {
            throw new RuntimeException(ErrorMessage.STUDY_PLAN_NOT_FOUND);
        }
    }
}

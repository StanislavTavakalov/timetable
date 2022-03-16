package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.studyplan.discipline.StudyDiscipline;
import com.bntu.timetable.repository.StudyDisciplineRepository;
import com.bntu.timetable.service.api.StudyDisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudyDisciplineServiceImpl implements StudyDisciplineService {

    @Autowired
    private StudyDisciplineRepository studyDisciplineRepository;

    @Override
    public StudyDiscipline getStudyDiscipline(UUID id) {
        return studyDisciplineRepository.findById(id).orElse(null);
    }

    @Override
    public List<StudyDiscipline> getStudyDisciplines() {
        return studyDisciplineRepository.findAll();
    }

    @Override
    public StudyDiscipline createStudyDiscipline(StudyDiscipline studyDiscipline) {
        return studyDisciplineRepository.save(studyDiscipline);
    }

    @Override
    public StudyDiscipline updateStudyDiscipline(StudyDiscipline studyDiscipline) {
        return studyDisciplineRepository.save(studyDiscipline);
    }

    @Override
    public void deleteStudyDiscipline(UUID id) {
        studyDisciplineRepository.deleteById(id);
    }
}

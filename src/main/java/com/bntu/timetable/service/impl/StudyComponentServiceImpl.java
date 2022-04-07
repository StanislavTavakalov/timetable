package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.studyplan.structure.StudyComponent;
import com.bntu.timetable.service.api.StudyComponentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudyComponentServiceImpl implements StudyComponentService {

    @Override
    public StudyComponent getStudyComponent(UUID id) {
        return null;
    }

    @Override
    public List<StudyComponent> getStudyComponents() {
        return null;
    }

    @Override
    public StudyComponent createStudyComponent(StudyComponent studyComponent) {
        return null;
    }

    @Override
    public StudyComponent updateStudyComponent(StudyComponent studyComponent) {
        return null;
    }

    @Override
    public void deleteStudyComponent(UUID id) {

    }
}

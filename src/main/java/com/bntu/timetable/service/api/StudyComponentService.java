package com.bntu.timetable.service.api;

import com.bntu.timetable.entity.studyplan.discipline.StudyComponent;

import java.util.List;
import java.util.UUID;

public interface StudyComponentService {

    StudyComponent getStudyComponent(UUID id);

    List<StudyComponent> getStudyComponents();

    StudyComponent createStudyComponent(StudyComponent studyComponent);

    StudyComponent updateStudyComponent(StudyComponent studyComponent);

    void deleteStudyComponent(UUID id);

}

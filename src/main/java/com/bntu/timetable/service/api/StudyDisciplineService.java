package com.bntu.timetable.service.api;

import com.bntu.timetable.entity.studyplan.discipline.StudyDiscipline;

import java.util.List;
import java.util.UUID;

public interface StudyDisciplineService {
    StudyDiscipline getStudyDiscipline(UUID id);

    List<StudyDiscipline> getStudyDisciplines();

    StudyDiscipline createStudyDiscipline(StudyDiscipline studyDiscipline);

    StudyDiscipline updateStudyDiscipline(StudyDiscipline studyDiscipline);

    void deleteStudyDiscipline(UUID id);

}

package com.bntu.timetable.service.api;


import com.bntu.timetable.entity.studyplan.discipline.StudyDisciplineGroup;

import java.util.List;
import java.util.UUID;

public interface StudyDisciplineGroupService {
    StudyDisciplineGroup getStudyDisciplineGroup(UUID id);

    List<StudyDisciplineGroup> getStudyDisciplineGroups();

    StudyDisciplineGroup createStudyDisciplineGroup(StudyDisciplineGroup studyDisciplineGroup);

    StudyDisciplineGroup updateStudyDisciplineGroup(StudyDisciplineGroup studyDisciplineGroup);

    void deleteStudyDisciplineGroup(UUID id);
}

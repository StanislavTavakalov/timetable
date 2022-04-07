package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.studyplan.structure.StudyDisciplineGroup;
import com.bntu.timetable.repository.StudyDisciplineGroupRepository;
import com.bntu.timetable.service.api.StudyDisciplineGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudyDisciplineGroupServiceImpl implements StudyDisciplineGroupService {

    @Autowired
    private StudyDisciplineGroupRepository studyDisciplineGroupRepository;

    @Override
    public StudyDisciplineGroup getStudyDisciplineGroup(UUID id) {
        return studyDisciplineGroupRepository.findById(id).orElse(null);
    }

    @Override
    public List<StudyDisciplineGroup> getStudyDisciplineGroups() {
        return studyDisciplineGroupRepository.findAll();
    }

    @Override
    public StudyDisciplineGroup createStudyDisciplineGroup(StudyDisciplineGroup studyDisciplineGroup) {
        return studyDisciplineGroupRepository.save(studyDisciplineGroup);
    }

    @Override
    public StudyDisciplineGroup updateStudyDisciplineGroup(StudyDisciplineGroup studyDisciplineGroup) {
        return studyDisciplineGroupRepository.save(studyDisciplineGroup);
    }

    @Override
    public void deleteStudyDisciplineGroup(UUID id) {
        studyDisciplineGroupRepository.deleteById(id);
    }
}

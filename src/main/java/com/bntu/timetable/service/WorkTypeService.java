package com.bntu.timetable.service;

import com.bntu.timetable.entity.WorkType;

import java.util.List;
import java.util.UUID;

public interface WorkTypeService {

    WorkType getWorkType(UUID id);

    List<WorkType> getWorkTypes();

    WorkType createWorkType(WorkType workType);

    WorkType updateWorkType(WorkType WorkType);

    void deleteWorkType(UUID id);
}

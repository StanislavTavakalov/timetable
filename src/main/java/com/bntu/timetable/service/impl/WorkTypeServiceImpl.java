package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.WorkType;
import com.bntu.timetable.repository.WorkTypeRepository;
import com.bntu.timetable.service.WorkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WorkTypeServiceImpl implements WorkTypeService {

    @Autowired
    private WorkTypeRepository workTypeRepository;

    @Override
    public WorkType getWorkType(UUID id) {
        return null;
    }

    @Override
    public List<WorkType> getWorkTypes() {
        return workTypeRepository.findAll();
    }

    @Override
    public WorkType createWorkType(WorkType workType) {
        return null;
    }

    @Override
    public WorkType updateWorkType(WorkType WorkType) {
        return null;
    }

    @Override
    public void deleteWorkType(UUID id) {

    }
}

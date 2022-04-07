package com.bntu.timetable.service.impl.teacher;

import com.bntu.timetable.entity.teacher.WorkTariff;
import com.bntu.timetable.repository.teacher.WorkTariffRepository;
import com.bntu.timetable.service.api.teacher.WorkTariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WorkTariffServiceImpl implements WorkTariffService {

    @Autowired
    private WorkTariffRepository workTariffRepository;

    @Override
    public WorkTariff getWorkTariff(UUID id) {
        return null;
    }

    @Override
    public List<WorkTariff> getWorkTariffs() {
        return workTariffRepository.findAll();
    }

    @Override
    public WorkTariff createWorkTariff(WorkTariff workTariff) {
        return null;
    }

    @Override
    public WorkTariff updateWorkTariff(WorkTariff workTariff) {
        return null;
    }

    @Override
    public void deleteWorkTariff(UUID id) {

    }
}

package com.bntu.timetable.service;

import com.bntu.timetable.entity.WorkTariff;

import java.util.List;
import java.util.UUID;

public interface WorkTariffService {

    WorkTariff getWorkTariff(UUID id);

    List<WorkTariff> getWorkTariffs();

    WorkTariff createWorkTariff(WorkTariff workTariff);

    WorkTariff updateWorkTariff(WorkTariff workTariff);

    void deleteWorkTariff(UUID id);
}

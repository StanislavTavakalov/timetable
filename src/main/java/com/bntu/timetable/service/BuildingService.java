package com.bntu.timetable.service;

import com.bntu.timetable.entity.Building;

import java.util.List;
import java.util.UUID;

public interface BuildingService {

    Building createBuilding (Building building);

    Building updateBuilding (Building building);

    Building getBuilding(UUID id);

    void deleteBuilding(UUID id);

    List<Building> getBuildings();

}

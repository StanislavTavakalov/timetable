package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Building;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.BuildingRepository;
import com.bntu.timetable.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    @Override
    public Building createBuilding(Building building) {
        building.setCreatedWhen(new Date());
        building.setUpdatedWhen(new Date());
        return buildingRepository.save(building);
    }

    @Override
    public Building updateBuilding(Building building) {
        building.setUpdatedWhen(new Date());
        return buildingRepository.save(building);
    }

    @Override
    public Building getBuilding(UUID id) {
        return getBuildingById(id);
    }

    private Building getBuildingById(UUID id) {
        Building building = buildingRepository.findById(id).orElse(null);
        if (building == null) {
            throw new RuntimeException(ErrorMessage.BUILDING_NOT_FOUND);
        }
        return building;
    }

    @Override
    public void deleteBuilding(UUID id) {
        buildingRepository.deleteById(id);
    }

    @Override
    public List<Building> getBuildings() {
        return buildingRepository.findAll();
    }
}

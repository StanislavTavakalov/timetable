package com.bntu.timetable.service.impl;

import com.bntu.timetable.dto.BuildingCreateRequest;
import com.bntu.timetable.entity.Building;
import com.bntu.timetable.entity.Classroom;
import com.bntu.timetable.entity.Floor;
import com.bntu.timetable.entity.Wing;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.BuildingRepository;
import com.bntu.timetable.repository.ClassroomRepository;
import com.bntu.timetable.repository.FloorRepository;
import com.bntu.timetable.repository.WingRepository;
import com.bntu.timetable.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private FloorRepository floorRepository;

    @Autowired
    private WingRepository wingRepository;

    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public Building createBuilding(BuildingCreateRequest buildingCR) {
        Building building = new Building();
        building.setNumber(buildingCR.getNumber());
        building.setDescription(buildingCR.getDescription());
        building.setCreatedWhen(new Date());
        building.setUpdatedWhen(new Date());

        building = buildingRepository.save(building);
        for (int i = 1; i <= buildingCR.getFloorsNumber(); i++) {
            Floor floor = new Floor();
            floor.setCreatedWhen(new Date());
            floor.setUpdatedWhen(new Date());
            floor.setNumber(i);
            floor.setBuilding(building);
            floorRepository.save(floor);
        }

        return getBuilding(building.getId());
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
        List<Floor> floors = floorRepository.getAllByBuilding_id(id);
        List<Wing> wings = new ArrayList<>();
        List<Classroom> classrooms = new ArrayList<>();
        for (Floor floor: floors) {
            List<Wing> wingsByFloor = wingRepository.getAllByFloor_Id(floor.getId());
            wings.addAll(wingsByFloor);
            for (Wing wing: wings) {
                List<Classroom> classroomsByWing = classroomRepository.getAllByWing_id(wing.getId());
                classrooms.addAll(classroomsByWing);
            }
        }
        classroomRepository.deleteAll(classrooms);
        wingRepository.deleteAll(wings);
        floorRepository.deleteAll(floors);
        buildingRepository.deleteById(id);

    }

    @Override
    public List<Building> getBuildings() {
        return buildingRepository.findAll();
    }
}

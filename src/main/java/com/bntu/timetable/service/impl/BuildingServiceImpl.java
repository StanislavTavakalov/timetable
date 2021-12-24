package com.bntu.timetable.service.impl;

import com.bntu.timetable.dto.BuildingCreateRequest;
import com.bntu.timetable.entity.*;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.*;
import com.bntu.timetable.service.BuildingService;
import com.bntu.timetable.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

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

    @Autowired
    private ClassroomTypeRepository classroomTypeRepository;

    @Autowired
    private ClassroomSpecializationRepository classroomSpecializationRepository;

    @Override
    public Building createBuilding(BuildingCreateRequest buildingCR) {
        Building building = new Building();
        building.setNumber(buildingCR.getNumber());
        building.setDescription(buildingCR.getDescription());
        building.setCreatedWhen(new Date());
        building.setUpdatedWhen(new Date());
        building.setFloors(new ArrayList<>());


        for (int i = 1; i <= buildingCR.getFloorsNumber(); i++) {
            Floor floor = new Floor();
            floor.setCreatedWhen(new Date());
            floor.setUpdatedWhen(new Date());
            floor.setNumber(i);
            floor.setBuilding(building);
            building.getFloors().add(floor);
        }

        return buildingRepository.save(building);
    }

    @Override
    public Building updateBuilding(Building buildingDto) {
        for (Floor floor : buildingDto.getFloors()) {
            updateWing(floor);
            floor.setBuilding(buildingDto);
            floor.setUpdatedWhen(new Date());
        }
        return buildingRepository.save(buildingDto);
    }

    private void updateWing(Floor floor) {
        for (Wing wing : floor.getWings()) {
            wing.setUpdatedWhen(new Date());
            wing.setFloor(floor);
            updateClassrooms(wing);
        }
    }

    private void updateClassrooms(Wing wing) {
        for (Classroom classroom : wing.getClassrooms()) {
            classroom.setUpdatedWhen(new Date());
            classroom.setWing(wing);
        }
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
        for (Floor floor : floors) {
            List<Wing> wingsByFloor = wingRepository.getAllByFloor_Id(floor.getId());
            wings.addAll(wingsByFloor);
            for (Wing wing : wings) {
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

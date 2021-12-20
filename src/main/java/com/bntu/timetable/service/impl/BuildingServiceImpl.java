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
    public Building updateBuilding(Building buildingDto) {
        Building building = getBuilding(buildingDto.getId());
        building.setUpdatedWhen(new Date());
        building.setNumber(buildingDto.getNumber());
        building.setDescription(buildingDto.getDescription());
        building = buildingRepository.save(building);
        updateFloors(buildingDto.getFloors(), building);
        return getBuilding(building.getId());
    }

    private void updateFloors(List<Floor> floors, Building building) {
        for (Floor floorDto : floors) {
            Floor floor;
            if (floorDto.getId() != null) {
                floor = floorRepository.findById(floorDto.getId()).orElse(null);
            } else {
                floor = new Floor();
                floor.setCreatedWhen(new Date());
            }

            if (floor == null) {
                throw new RuntimeException("Unable to found floor by id: " + floorDto.getId());
            }
            floor.setUpdatedWhen(new Date());
            floor.setNumber(floorDto.getNumber());
            floor.setBuilding(building);
            floor = floorRepository.save(floor);
            updateWing(floorDto.getWings(), floor);
        }
        deleteFloors(floors, building);
    }

    private void deleteFloors(List<Floor> floors, Building building) {
        List<Floor> floorToDelete = floorRepository.getAllByBuilding_id(building.getId()).stream()
                .filter(floor -> floor.getNumber() > floors.size()).collect(Collectors.toList());
        floorRepository.deleteAll(floorToDelete);
    }

    private void updateWing(List<Wing> wings, Floor floor) {
        for (Wing wingDto : wings) {
            Wing wing;
            if (wingDto.getId() != null) {
                wing = wingRepository.findById(wingDto.getId()).orElse(null);
            } else {
                wing = new Wing();
                wing.setCreatedWhen(new Date());
            }
            if (wing == null) {
                throw new RuntimeException("Unable to found wing by id: " + wingDto.getId());
            }
            wing.setUpdatedWhen(new Date());
            wing.setName(wingDto.getName());
            wing.setFloor(floor);
            wing.setPlanImage(wingDto.getPlanImage());
            wing = wingRepository.save(wing);
            if (wingDto.getClassrooms() != null) {
                updateClassrooms(wingDto.getClassrooms(), wing);
            }
        }
        deleteWings(wings, floor);
    }

    private void updateClassrooms(List<Classroom> classrooms, Wing wing) {

        for (Classroom classroomDto : classrooms) {
            Classroom classroom;
            if (classroomDto.getId() != null) {
                classroom = classroomRepository.findById(classroomDto.getId()).orElse(null);
            } else {
                classroom = new Classroom();
                classroom.setCreatedWhen(new Date());
            }
            if (classroom == null) {
                throw new RuntimeException("Unable to found classroom by id: " + classroomDto.getId());
            }
            classroom.setUpdatedWhen(new Date());
            classroom.setNumber(classroomDto.getNumber());
            classroom.setCapacity(classroomDto.getCapacity());
            classroom.setX(classroomDto.getX());
            classroom.setY(classroomDto.getY());
            classroom.setWidth(classroomDto.getWidth());
            classroom.setHeight(classroomDto.getHeight());
            classroom.setWing(wing);

            classroom.setClassroomSpecialization(classroomSpecializationRepository.findById
                    (classroomDto.getClassroomSpecialization().getId()).orElse(null));
            classroom.setClassroomType(classroomTypeRepository.findById(classroomDto.getClassroomType().getId()).orElse(null));
            classroom = classroomRepository.save(classroom);
        }
        deleteClassrooms(classrooms, wing);
    }

    private void deleteClassrooms(List<Classroom> classrooms, Wing wing) {
        List<Classroom> classroomsList = classroomRepository.getAllByWing_id(wing.getId());
        List<String> classroomsNames = classrooms.stream().map(Classroom::getNumber).collect(Collectors.toList());
        for (Classroom classroom : classroomsList) {
            if (!classroomsNames.contains(classroom.getNumber())) {
                classroomRepository.delete(classroom);
            }
        }
    }

    private void deleteWings(List<Wing> wings, Floor floor) {
        List<Wing> wingsList = wingRepository.getAllByFloor_Id(floor.getId());
        List<String> wingNames = wings.stream().map(Wing::getName).collect(Collectors.toList());
        for (Wing wing : wingsList) {
            if (!wingNames.contains(wing.getName())) {
                wingRepository.delete(wing);
            }
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

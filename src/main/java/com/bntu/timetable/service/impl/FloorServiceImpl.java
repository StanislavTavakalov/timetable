package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.ClassroomType;
import com.bntu.timetable.entity.Floor;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.FloorRepository;
import com.bntu.timetable.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class FloorServiceImpl implements FloorService {
    @Autowired
    private FloorRepository floorRepository;

    @Override
    public Floor createFloor(Floor floor) {
        floor.setCreatedWhen(new Date());
        floor.setUpdatedWhen(new Date());
        return floorRepository.save(floor);
    }

    @Override
    public Floor updateFloor(Floor floor) {
        floor.setUpdatedWhen(new Date());
        return floorRepository.save(floor);
    }

    @Override
    public Floor getFloor(UUID id) {
        return getFloorById(id);
    }

    @Override
    public void deleteFloor(UUID id) {
        floorRepository.deleteById(id);
    }

    @Override
    public List<Floor> getFloors() {
        return floorRepository.findAll();
    }

    private Floor getFloorById(UUID id) {
        Floor floor = floorRepository.findById(id).orElse(null);
        if (floor == null) {
            throw new RuntimeException(ErrorMessage.FLOOR_NOT_FOUND);
        }
        return floor;
    }
}

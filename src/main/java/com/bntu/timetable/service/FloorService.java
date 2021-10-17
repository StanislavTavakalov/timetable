package com.bntu.timetable.service;

import com.bntu.timetable.entity.Floor;

import java.util.List;
import java.util.UUID;

public interface FloorService {

    Floor createFloor (Floor floor);

    Floor updateFloor (Floor floor);

    Floor getFloor(UUID id);

    void deleteFloor(UUID id);

    List<Floor> getFloors();

}

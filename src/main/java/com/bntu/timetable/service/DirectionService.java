package com.bntu.timetable.service;

import com.bntu.timetable.entity.Direction;

import java.util.List;
import java.util.UUID;

public interface DirectionService {

    Direction getDirection(UUID id);

    List<Direction> getDirections();

    Direction createDirection(Direction direction);

    Direction updateDirection(Direction direction);

    void deleteDirection(UUID id);
}

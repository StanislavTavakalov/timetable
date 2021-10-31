package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Direction;
import com.bntu.timetable.repository.DirectionRepository;
import com.bntu.timetable.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DirectionServiceImpl implements DirectionService {

    @Autowired
    private DirectionRepository directionRepository;

    @Override
    public Direction getDirection(UUID id) {
        return null;
    }

    @Override
    public List<Direction> getDirections() {
        return directionRepository.findAll();
    }

    @Override
    public Direction createDirection(Direction direction) {
        return null;
    }

    @Override
    public Direction updateDirection(Direction direction) {
        return null;
    }

    @Override
    public void deleteDirection(UUID id) {

    }
}

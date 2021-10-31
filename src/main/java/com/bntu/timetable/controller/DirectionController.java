package com.bntu.timetable.controller;

import com.bntu.timetable.entity.Direction;
import com.bntu.timetable.entity.Role;
import com.bntu.timetable.service.DirectionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/directions")
@Slf4j
public class DirectionController {

    @Autowired
    private DirectionService directionService;

    @GetMapping
    @PreAuthorize("hasAuthority('directions:read')")
    public List<Direction> getDirections() {
        return directionService.getDirections();
    }
}

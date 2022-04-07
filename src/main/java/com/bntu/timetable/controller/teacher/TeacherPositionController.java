package com.bntu.timetable.controller.teacher;

import com.bntu.timetable.entity.teacher.TeacherPosition;
import com.bntu.timetable.service.api.teacher.TeacherPositionService;
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
@RequestMapping("api/v1/positions")
@Slf4j
public class TeacherPositionController {

    @Autowired
    private TeacherPositionService teacherPositionService;

    @GetMapping
    @PreAuthorize("hasAuthority('positions:read')")
    public List<TeacherPosition> getTeacherPositions() {
        return teacherPositionService.getTeacherPositions();
    }
}

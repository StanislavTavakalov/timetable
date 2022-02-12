package com.bntu.timetable.controller;

import com.bntu.timetable.entity.WorkType;
import com.bntu.timetable.service.WorkTypeService;
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
@RequestMapping("api/v1/work_types")
@Slf4j
public class WorkTypeController {

    @Autowired
    private WorkTypeService workTypeService;

    @GetMapping
    @PreAuthorize("hasAuthority('worktypes:read')")
    public List<WorkType> getWorkTypes() {
        return workTypeService.getWorkTypes();
    }
}

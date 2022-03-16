package com.bntu.timetable.controller;

import com.bntu.timetable.entity.teacher.WorkTariff;
import com.bntu.timetable.service.api.WorkTariffService;
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
@RequestMapping("api/v1/work_tariffs")
@Slf4j
public class WorkTariffController {

    @Autowired
    private WorkTariffService workTariffService;

    @GetMapping
    @PreAuthorize("hasAuthority('worktariffs:read')")
    public List<WorkTariff> getWorkTariffs() {
        return workTariffService.getWorkTariffs();
    }
}

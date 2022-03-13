package com.bntu.timetable.controller;

import com.bntu.timetable.entity.AcademicTitle;
import com.bntu.timetable.service.AcademicTitleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/academic_titles")
@Slf4j
public class AcademicTitleController {

    @Autowired
    private AcademicTitleService academicTitleService;

    @GetMapping
    @PreAuthorize("hasAuthority('titles:read')")
    public List<AcademicTitle> getAcademicTitles() {
        return academicTitleService.getAcademicTitles();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('titles:create')")
    public AcademicTitle createAcademicTitle(@RequestBody AcademicTitle academicTitle) {
        return academicTitleService.createAcademicTitle(academicTitle);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('titles:update')")
    public AcademicTitle updateAcademicTitle(@RequestBody AcademicTitle academicTitle) {
        return academicTitleService.updateAcademicTitle(academicTitle);
    }
}

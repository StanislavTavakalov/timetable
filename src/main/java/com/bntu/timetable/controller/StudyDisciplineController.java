package com.bntu.timetable.controller;

import com.bntu.timetable.entity.studyplan.structure.StudyDiscipline;
import com.bntu.timetable.service.api.StudyDisciplineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/disciplines")
@Slf4j
public class StudyDisciplineController {
    @Autowired
    private StudyDisciplineService studyDisciplineService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('discipline:read')")
    public ResponseEntity<?> getDiscipline(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(studyDisciplineService.getStudyDiscipline(id));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    @PreAuthorize("hasAuthority('discipline:read')")
    public List<StudyDiscipline> getDisciplines() {
        return studyDisciplineService.getStudyDisciplines();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('discipline:create')")
    public StudyDiscipline createDiscipline(@RequestBody StudyDiscipline studyDiscipline) {
        return studyDisciplineService.createStudyDiscipline(studyDiscipline);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('discipline:update')")
    public StudyDiscipline updateDiscipline(@RequestBody StudyDiscipline studyDiscipline) {
        return studyDisciplineService.updateStudyDiscipline(studyDiscipline);
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('discipline:delete')")
    public ResponseEntity<?> deleteDiscipline(@PathVariable UUID id) {
        try {
            studyDisciplineService.deleteStudyDiscipline(id);
        } catch (RuntimeException exception) {
            log.error(exception.getMessage());
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(true);
    }
}

package com.bntu.timetable.controller;

import com.bntu.timetable.entity.studyplan.discipline.StudyDisciplineGroup;
import com.bntu.timetable.service.api.StudyDisciplineGroupService;
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
@RequestMapping("api/v1/disciplinegroups")
@Slf4j
public class StudyDisciplineGroupController {

    @Autowired
    private StudyDisciplineGroupService studyDisciplineGroupService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('discipline:read')")
    public ResponseEntity<?> getDiscipline(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(studyDisciplineGroupService.getStudyDisciplineGroup(id));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    @PreAuthorize("hasAuthority('discipline:read')")
    public List<StudyDisciplineGroup> getDisciplines() {
        return studyDisciplineGroupService.getStudyDisciplineGroups();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('discipline:create')")
    public StudyDisciplineGroup createDiscipline(@RequestBody StudyDisciplineGroup studyDisciplineGroup) {
        return studyDisciplineGroupService.createStudyDisciplineGroup(studyDisciplineGroup);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('discipline:update')")
    public StudyDisciplineGroup updateDiscipline(@RequestBody StudyDisciplineGroup studyDisciplineGroup) {
        return studyDisciplineGroupService.updateStudyDisciplineGroup(studyDisciplineGroup);
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('discipline:delete')")
    public ResponseEntity<?> deleteDiscipline(@PathVariable UUID id) {
        try {
            studyDisciplineGroupService.deleteStudyDisciplineGroup(id);
        } catch (RuntimeException exception) {
            log.error(exception.getMessage());
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(true);
    }

}

package com.bntu.timetable.controller.studyplan;

import com.bntu.timetable.entity.studyplan.StudyPlan;
import com.bntu.timetable.service.api.studyplan.StudyPlanService;
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
@RequestMapping("api/v1/studyplans")
@Slf4j
public class StudyPlanController {

    @Autowired
    private StudyPlanService studyPlanService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('studyplan:read')")
    public ResponseEntity<?> getStudyPlan(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(studyPlanService.getStudyPlan(id));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    @PreAuthorize("hasAuthority('studyplan:read')")
    public List<StudyPlan> getStudyPlans() {
        return studyPlanService.getStudyPlans();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('studyplan:create')")
    public StudyPlan createStudyPlan(@RequestBody StudyPlan studyPlan) {
        return studyPlanService.createStudyPlan(studyPlan);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('studyplan:update')")
    public StudyPlan updateStudyPlan(@RequestBody StudyPlan studyPlan) {
        return studyPlanService.updateStudyPlan(studyPlan);
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('studyplan:delete')")
    public ResponseEntity<?> deleteDiscipline(@PathVariable UUID id) {
        try {
            studyPlanService.deleteStudyPlan(id);
        } catch (RuntimeException exception) {
            log.error(exception.getMessage());
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(true);
    }
}

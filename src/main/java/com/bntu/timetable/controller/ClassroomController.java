package com.bntu.timetable.controller;

import java.util.List;
import java.util.UUID;

import com.bntu.timetable.entity.Classroom;
import com.bntu.timetable.service.ClassroomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/classrooms")
@Slf4j
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('classroom:read')")
    public ResponseEntity<?> getClassroom(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(classroomService.getClassroom(id));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    @PreAuthorize("hasAuthority('classroom:read')")
    public List<Classroom> getClassrooms() {
        return classroomService.getClassrooms();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('classroom:create')")
    public Classroom createClassroom(@RequestBody Classroom classroom) {
        return classroomService.createClassroom(classroom);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('classroom:update')")
    public Classroom updateClassroom(@RequestBody Classroom classroom) {
        return classroomService.updateClassroom(classroom);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('classroom:delete')")
    public ResponseEntity<?> deleteClassroom(@PathVariable UUID id) {
        try {
            classroomService.deleteClassroom(id);
        } catch (RuntimeException exception) {
            log.error(exception.getMessage());
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(true);
    }

}

package com.bntu.timetable.controller;

import com.bntu.timetable.entity.Deanery;
import com.bntu.timetable.entity.Flow;
import com.bntu.timetable.entity.Group;
import com.bntu.timetable.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/groups")
@Slf4j
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('group:read')")
    public ResponseEntity<?> getGroup(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(groupService.getGroup(id));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    // TODO reimplement this fast solution.
    @GetMapping
    @PreAuthorize("hasAuthority('group:read')")
    public List<Group> getGroups(@RequestParam(required = false) UUID deaneryId,
                                 @RequestParam(required = false) UUID departmentId,
                                 @RequestParam(required = false) boolean withoutFlow) {
        if (deaneryId != null) {
            List<Group> groups = groupService.getGroupsByDeaneryId(deaneryId);
            if (withoutFlow) {
                return filterOutGroupsWithoutFlow(groups);
            }
            return groups;
        } else if (departmentId != null) {
            List<Group> groups =groupService.getGroupsByDepartmentId(departmentId);
            if (withoutFlow) {
                return filterOutGroupsWithoutFlow(groups);
            }
            return groups;
        }
        List<Group> groups = groupService.getGroups();
        if (withoutFlow) {
            return filterOutGroupsWithoutFlow(groups);
        }
        return groupService.getGroups();
    }

    private List<Group> filterOutGroupsWithoutFlow(List<Group> groups) {
        return  groups.stream().filter(g -> g.getFlow() == null).collect(Collectors.toList());
    }

    @PostMapping
    @PreAuthorize("hasAuthority('group:create')")
    public Group createGroup(@RequestBody Group group) {
        return groupService.createGroup(group);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('group:update')")
    public Group updateGroup(@RequestBody Group group) {
        return groupService.updateGroup(group);
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('group:delete')")
    public ResponseEntity<?> deleteGroup(@PathVariable UUID id) {
        try {
            groupService.deleteGroup(id);
        } catch (RuntimeException exception) {
            log.error(exception.getMessage());
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(true);
    }
}

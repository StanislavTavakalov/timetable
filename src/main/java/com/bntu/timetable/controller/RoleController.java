package com.bntu.timetable.controller;

import com.bntu.timetable.entity.Permission;
import com.bntu.timetable.entity.Role;
import com.bntu.timetable.service.PermissionService;
import com.bntu.timetable.service.RoleService;
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
@RequestMapping("api/v1/roles")
@Slf4j
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('roles:read')")
    public ResponseEntity<?> getRole(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(roleService.getRole(id));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    @PreAuthorize("hasAuthority('roles:read')")
    public List<Role> getRoles() {
        return roleService.getRoles();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('roles:write')")
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('roles:update')")
    public Role updateRole(@RequestBody Role role) {
        return roleService.updateRole(role);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('roles:delete')")
    public ResponseEntity<?> deleteRole(@PathVariable UUID id) {
        try {
            roleService.deleteRole(id);
        } catch (RuntimeException exception) {
            log.error(exception.getMessage());
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(true);
    }


    @GetMapping("/permissions")
    @PreAuthorize("hasAuthority('roles:read')")
    public List<Permission> getPermissions() {
        return permissionService.getPermissions();
    }

}

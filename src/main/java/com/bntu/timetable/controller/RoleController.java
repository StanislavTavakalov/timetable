package com.bntu.timetable.controller;

import com.bntu.timetable.entity.Role;
import com.bntu.timetable.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('roles:read')")
    public Role getRole(@PathVariable UUID id) {
        return roleService.getRole(id);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('roles:read')")
    public List<Role> getRoles() {
        return roleService.getRoles();
    }
}

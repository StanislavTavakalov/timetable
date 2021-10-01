package com.bntu.timetable.service;

import com.bntu.timetable.entity.Role;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    Role getRole(UUID id);
    List<Role> getRoles();
}

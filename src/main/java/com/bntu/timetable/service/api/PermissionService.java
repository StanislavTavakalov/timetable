package com.bntu.timetable.service.api;

import com.bntu.timetable.entity.user.Permission;

import java.util.List;

public interface PermissionService {

    List<Permission> getPermissions();

}

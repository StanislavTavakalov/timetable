package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.user.Permission;
import com.bntu.timetable.repository.PermissionRepository;
import com.bntu.timetable.service.api.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> getPermissions() {
        return permissionRepository.findAll();
    }

}

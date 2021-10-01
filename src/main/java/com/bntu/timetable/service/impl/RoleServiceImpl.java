package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Role;
import com.bntu.timetable.repository.RoleRepository;
import com.bntu.timetable.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getRole(UUID id) {
        Optional<Role> role = roleRepository.findById(id);
        return role.orElse(null);
    }

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }
}

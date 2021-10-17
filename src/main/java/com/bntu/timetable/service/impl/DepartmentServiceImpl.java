package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Department;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.DepartmentRepository;
import com.bntu.timetable.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(Department department) {
        department.setCreatedWhen(new Date());
        department.setUpdatedWhen(new Date());
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        department.setUpdatedWhen(new Date());
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartment(UUID id) {
        return getDepartmentById(id);
    }

    private Department getDepartmentById(UUID departmentId) {
        Department department = departmentRepository.findById(departmentId).orElse(null);
        if (department == null) {
            throw new RuntimeException(ErrorMessage.DEPARTMENT_NOT_FOUND);
        }
        return department;
    }

    @Override
    public void deleteDepartment(UUID id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }
}
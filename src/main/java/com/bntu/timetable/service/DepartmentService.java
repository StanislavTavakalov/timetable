package com.bntu.timetable.service;

import com.bntu.timetable.entity.Department;

import java.util.List;
import java.util.UUID;

public interface DepartmentService {

    Department createDepartment (Department department);

    Department updateDepartment (Department department);

    Department getDepartment(UUID id);

    void deleteDepartment(UUID id);

    List<Department> getDepartments();

}

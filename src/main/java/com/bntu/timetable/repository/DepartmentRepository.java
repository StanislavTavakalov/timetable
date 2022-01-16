package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DepartmentRepository extends JpaRepository<Department, UUID> {

    List<Department> findAllByDeanery_Id(UUID deaneryId);

}

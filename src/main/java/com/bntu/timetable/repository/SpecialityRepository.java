package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SpecialityRepository extends JpaRepository<Speciality, UUID> {
    List<Speciality> findAllByDepartment_Id(UUID departmentId);
}

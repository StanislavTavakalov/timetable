package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GroupRepository extends JpaRepository<Group, UUID> {

    List<Group> findAllBySpeciality_Department_Deanery_Id(UUID deaneryId);

    List<Group> findAllBySpeciality_Department_Id(UUID departmentId);

}

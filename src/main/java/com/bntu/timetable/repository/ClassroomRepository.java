package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ClassroomRepository extends JpaRepository<Classroom, UUID> {

    void deleteAllByWing_Id(UUID wingId);

    List<Classroom> getAllByWing_id (UUID wingId);
}

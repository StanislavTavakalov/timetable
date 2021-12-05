package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Building;
import com.bntu.timetable.entity.Floor;
import com.bntu.timetable.entity.Wing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FloorRepository extends JpaRepository<Floor, UUID> {

    void deleteAllFloorByBuilding_Id(UUID id);

    List<Floor> getAllByBuilding_id (UUID id);

}

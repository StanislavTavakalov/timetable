package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FloorRepository extends JpaRepository<Floor, UUID> {

    void deleteAllFloorByBuilding_Id(UUID id);

    List<Floor> getAllByBuilding_id (UUID id);

}

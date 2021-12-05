package com.bntu.timetable.repository;

import com.bntu.timetable.entity.Wing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface WingRepository  extends JpaRepository<Wing, UUID> {

    void deleteAllWingByFloor_Id(UUID floorId);

    List<Wing> getAllByFloor_Id(UUID floorId);
}

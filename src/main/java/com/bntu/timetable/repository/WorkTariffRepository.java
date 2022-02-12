package com.bntu.timetable.repository;

import com.bntu.timetable.entity.WorkTariff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkTariffRepository extends JpaRepository<WorkTariff, UUID> {
}

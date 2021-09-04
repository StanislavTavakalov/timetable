package com.bntu.timetable.repository;

import com.bntu.timetable.entity.RegistrationToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RegistrationTokenRepository extends JpaRepository<RegistrationToken, UUID> {

}

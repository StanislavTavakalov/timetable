package com.bntu.timetable.service;

import com.bntu.timetable.entity.Wing;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.UUID;

public interface WingService {

    Wing createWing(Wing wing);

    Wing updateWing(Wing department);

    Wing uploadPlan(UUID id, String image) throws GeneralSecurityException, IOException;

    Wing getWing(UUID id);

    void deleteWing(UUID id);

    List<Wing> getWings();

}

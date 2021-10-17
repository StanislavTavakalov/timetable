package com.bntu.timetable.service;

import com.bntu.timetable.entity.Wing;

import java.util.List;
import java.util.UUID;

public interface WingService {

    Wing createWing(Wing wing);

    Wing updateWing(Wing department);

    Wing getWing(UUID id);

    void deleteWing(UUID id);

    List<Wing> getWings();

}

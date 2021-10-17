package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Wing;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.WingRepository;
import com.bntu.timetable.service.WingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class WingServiceImpl implements WingService {

    @Autowired
    private WingRepository wingRepository;

    @Override
    public Wing createWing(Wing wing) {
        wing.setCreatedWhen(new Date());
        wing.setUpdatedWhen(new Date());
        return wingRepository.save(wing);
    }

    @Override
    public Wing updateWing(Wing wing) {
        wing.setUpdatedWhen(new Date());
        return wingRepository.save(wing);
    }

    @Override
    public Wing getWing(UUID id) {
        return getWingById(id);
    }

    @Override
    public void deleteWing(UUID id) {
        wingRepository.deleteById(id);
    }

    @Override
    public List<Wing> getWings() {
        return wingRepository.findAll();
    }

    private Wing getWingById(UUID id) {
        Wing wing = wingRepository.findById(id).orElse(null);
        if (wing == null) {
            throw new RuntimeException(ErrorMessage.WING_NOT_FOUND);
        }
        return wing;
    }
}

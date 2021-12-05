package com.bntu.timetable.service.impl;

import com.bntu.timetable.dto.building.WingDto;
import com.bntu.timetable.entity.Wing;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.FloorRepository;
import com.bntu.timetable.repository.WingRepository;
import com.bntu.timetable.service.ImageService;
import com.bntu.timetable.service.WingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class WingServiceImpl implements WingService {

    @Autowired
    private WingRepository wingRepository;

    @Autowired
    private FloorRepository floorRepository;

    @Autowired
    private ImageService imageService;

    @Override
    public Wing createWing(WingDto wingDto) {
        Wing wing = new Wing();
        wing.setCreatedWhen(new Date());
        wing.setUpdatedWhen(new Date());
        wing.setName(wingDto.getName());
        wing.setFloor(floorRepository.findById(wingDto.getFloorId()).get());
       // wing.setPlanId(wingDto.getPlanId());
        return wingRepository.save(wing);
    }

    @Override
    public Wing updateWing(Wing wing) {
        wing.setUpdatedWhen(new Date());
        return wingRepository.save(wing);
    }

    @Override
    public Wing uploadPlan(UUID id, String plan) throws GeneralSecurityException, IOException {
        Wing wing = getWingById(id);
        wing.setUpdatedWhen(new Date());
        String wingPlanId = wing.getPlanId();
        if (wingPlanId != null) {
            imageService.delete(wingPlanId);
        }
        wing.setPlanId(imageService.save(plan));
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

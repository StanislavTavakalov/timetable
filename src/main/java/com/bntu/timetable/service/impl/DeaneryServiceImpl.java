package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Deanery;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.DeaneryRepository;
import com.bntu.timetable.service.DeaneryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class DeaneryServiceImpl implements DeaneryService {

    @Autowired
    private DeaneryRepository deaneryRepository;

    @Override
    public Deanery createDeanery(Deanery deanery) {
        deanery.setCreatedWhen(new Date());
        deanery.setUpdatedWhen(new Date());
        return deaneryRepository.save(deanery);
    }

    @Override
    public Deanery updateDeanery(Deanery deanery) {
        deanery.setUpdatedWhen(new Date());
        return deaneryRepository.save(deanery);
    }

    @Override
    public Deanery getDeanery(UUID id) {
        return getDeaneryById(id);
    }

    private Deanery getDeaneryById(UUID id) {
        Deanery deanery = deaneryRepository.findById(id).orElse(null);
        if (deanery == null) {
            throw new RuntimeException(ErrorMessage.DEANERY_NOT_FOUND);
        }
        return deanery;
    }

    @Override
    public void deleteDeanery(UUID id) {
        deaneryRepository.deleteById(id);
    }

    @Override
    public List<Deanery> getDeaneries() {
        return deaneryRepository.findAll();
    }
}

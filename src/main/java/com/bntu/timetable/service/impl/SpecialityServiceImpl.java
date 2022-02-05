package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Speciality;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.SpecialityRepository;
import com.bntu.timetable.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    private SpecialityRepository specialityRepository;

    @Override
    public Speciality createSpeciality(Speciality speciality) {
        speciality.setCreatedWhen(new Date());
        speciality.setUpdatedWhen(new Date());
        return specialityRepository.save(speciality);
    }

    @Override
    public Speciality updateSpeciality(Speciality specialityDto) {
        return specialityRepository.save(specialityDto);
    }


    @Override
    public Speciality getSpeciality(UUID id) {
        return getSpecialityById(id);
    }


    private Speciality getSpecialityById(UUID id) {
        Speciality speciality = specialityRepository.findById(id).orElse(null);
        if (speciality == null) {
            throw new RuntimeException(ErrorMessage.GROUP_NOT_FOUND);
        }
        return speciality;
    }

    @Override
    public void deleteSpeciality(UUID id) {
        specialityRepository.deleteById(id);
    }

    @Override
    public List<Speciality> getSpecialities() {
        return specialityRepository.findAll();
    }

    @Override
    public List<Speciality> getSpecialitiesByDepartment(UUID departmentId) {
        return specialityRepository.findAllByDepartment_Id(departmentId);
    }

}

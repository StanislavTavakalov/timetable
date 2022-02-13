package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.AcademicDegree;
import com.bntu.timetable.repository.AcademicDegreeRepository;
import com.bntu.timetable.service.AcademicDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicDegreeImpl implements AcademicDegreeService {

    @Autowired
    private AcademicDegreeRepository academicDegreeRepository;

    @Override
    public AcademicDegree getAcademicDegree(UUID id) {
        return null;
    }

    @Override
    public List<AcademicDegree> getAcademicDegrees() {
        return academicDegreeRepository.findAll();
    }

    @Override
    public AcademicDegree createAcademicDegree(AcademicDegree academicDegree) {
        return null;
    }

    @Override
    public AcademicDegree updateAcademicDegree(AcademicDegree AcademicDegree) {
        return null;
    }

    @Override
    public void deleteAcademicDegree(UUID id) {

    }
}

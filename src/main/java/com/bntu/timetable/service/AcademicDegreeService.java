package com.bntu.timetable.service;

import com.bntu.timetable.entity.AcademicDegree;

import java.util.List;
import java.util.UUID;

public interface AcademicDegreeService {

    AcademicDegree getAcademicDegree(UUID id);

    List<AcademicDegree> getAcademicDegrees();

    AcademicDegree createAcademicDegree(AcademicDegree academicDegree);

    AcademicDegree updateAcademicDegree(AcademicDegree AcademicDegree);

    void deleteAcademicDegree(UUID id);
}

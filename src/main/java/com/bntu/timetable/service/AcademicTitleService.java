package com.bntu.timetable.service;

import com.bntu.timetable.entity.AcademicTitle;

import java.util.List;
import java.util.UUID;

public interface AcademicTitleService {

    AcademicTitle getAcademicTitle(UUID id);

    List<AcademicTitle> getAcademicTitles();

    AcademicTitle createAcademicTitle(AcademicTitle academicTitle);

    AcademicTitle updateAcademicTitle(AcademicTitle academicTitle);

    void deleteAcademicTitle(UUID id);
}

package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.AcademicTitle;
import com.bntu.timetable.repository.AcademicTitleRepository;
import com.bntu.timetable.service.AcademicTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicTitleServiceImpl implements AcademicTitleService {

    @Autowired
    private AcademicTitleRepository academicTitleRepository;

    @Override
    public AcademicTitle getAcademicTitle(UUID id) {
        return null;
    }

    @Override
    public List<AcademicTitle> getAcademicTitles() {
        return academicTitleRepository.findAll();
    }

    @Override
    public AcademicTitle createAcademicTitle(AcademicTitle academicTitle) {
        return null;
    }

    @Override
    public AcademicTitle updateAcademicTitle(AcademicTitle academicTitle) {
        return null;
    }

    @Override
    public void deleteAcademicTitle(UUID id) {

    }
}

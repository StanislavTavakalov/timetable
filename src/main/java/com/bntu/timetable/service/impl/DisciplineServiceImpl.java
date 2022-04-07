package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.studyplan.structure.Discipline;
import com.bntu.timetable.repository.DisciplineRepository;
import com.bntu.timetable.service.api.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DisciplineServiceImpl implements DisciplineService {

    @Autowired
    private DisciplineRepository disciplineRepository;

    @Override
    public Discipline getDiscipline(UUID id) {
        return disciplineRepository.findById(id).orElse(null);
    }

    @Override
    public List<Discipline> getDisciplines() {
        return disciplineRepository.findAll();
    }

    @Override
    public Discipline createDiscipline(Discipline discipline) {
        return disciplineRepository.save(discipline);
    }

    @Override
    public Discipline updateDiscipline(Discipline discipline) {
        return disciplineRepository.save(discipline);
    }

    @Override
    public void deleteDiscipline(UUID id) {
        disciplineRepository.deleteById(id);
    }
}

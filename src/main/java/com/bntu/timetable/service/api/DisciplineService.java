package com.bntu.timetable.service.api;

import com.bntu.timetable.entity.studyplan.structure.Discipline;

import java.util.List;
import java.util.UUID;

public interface DisciplineService {
    Discipline getDiscipline(UUID id);

    List<Discipline> getDisciplines();

    Discipline createDiscipline(Discipline discipline);

    Discipline updateDiscipline(Discipline discipline);

    void deleteDiscipline(UUID id);

}

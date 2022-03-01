package com.bntu.timetable.dto;

import com.bntu.timetable.entity.AcademicDegree;
import com.bntu.timetable.entity.AcademicTitle;
import com.bntu.timetable.entity.TeacherPosition;
import com.bntu.timetable.entity.WorkTariff;
import lombok.Data;

import java.util.List;

@Data
public class InfoForTeacherCreation {
    private List<TeacherPosition> teacherPositions;
    private List<AcademicTitle> academicTitles;
    private List<AcademicDegree> academicDegrees;
    private List<WorkTariff> workTariffs;
}

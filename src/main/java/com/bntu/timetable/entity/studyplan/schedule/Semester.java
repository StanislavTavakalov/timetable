package com.bntu.timetable.entity.studyplan.schedule;

import com.bntu.timetable.entity.BaseEntity;
import com.bntu.timetable.entity.Flow;
import com.bntu.timetable.entity.studyplan.StudyPlan;
import com.bntu.timetable.entity.studyplan.structure.DisciplineSemesterLoad;
import com.bntu.timetable.entity.studyplan.structure.SemesterLoad;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "semester")
public class Semester extends BaseEntity {

    @Column(name = "semester_num")
    private BigInteger semesterNum;

    @Column(name = "week_count")
    private BigInteger weekCount;

    @OneToMany(mappedBy = "semester", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference(value = "schedule_activity_semester")
    private List<ScheduleActivity> scheduleActivities;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "study_plan_id")
    @JsonBackReference(value = "study_plan_semester")
    private StudyPlan studyPlan;

    @ManyToMany(mappedBy = "semesters")
    @JsonIgnore
    private List<DisciplineSemesterLoad> disciplineSemesterLoads;


}


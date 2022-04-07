package com.bntu.timetable.entity.studyplan.schedule;

import com.bntu.timetable.entity.BaseEntity;
import com.bntu.timetable.entity.studyplan.StudyPlan;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "educational_schedule")
public class EducationalSchedule extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "study_plan_id")
    private StudyPlan studyPlan;

    @OneToMany(mappedBy = "educationalSchedule")
    private List<EducationalScheduleSemester> educationalScheduleSemesters;

    @OneToMany(mappedBy = "educationalSchedule")
    private List<EducationalScheduleTotalActivity> educationalScheduleTotalActivities;

}

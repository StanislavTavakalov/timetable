package com.bntu.timetable.entity.studyplan.schedule;

import com.bntu.timetable.entity.BaseEntity;
import com.bntu.timetable.entity.studyplan.StudyPlan;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToOne(mappedBy = "educationalSchedule")
    @JsonIgnore
    private StudyPlan studyPlan;

    @OneToMany(mappedBy = "educationalSchedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EducationalScheduleSemester> educationalScheduleSemesters;

    @OneToMany(mappedBy = "educationalSchedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EducationalScheduleTotalActivity> educationalScheduleTotalActivities;

}

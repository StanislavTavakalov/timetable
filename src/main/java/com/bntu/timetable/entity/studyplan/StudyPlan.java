package com.bntu.timetable.entity.studyplan;

import com.bntu.timetable.entity.BaseEntity;
import com.bntu.timetable.entity.Qualification;
import com.bntu.timetable.entity.Speciality;
import com.bntu.timetable.entity.studyplan.schedule.EducationalSchedule;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "study_plan")
public class StudyPlan extends BaseEntity {

    @Column
    private String registerNumber;

    @Column
    private Integer semestersCount;

    @Column
    private Integer developmentYear;

//    @Column
//    private Qualification qualification;

    @ManyToOne
    @JoinColumn(name = "speciality_id")
    private Speciality speciality;

    @OneToOne
    private EducationalSchedule educationalSchedule;

}

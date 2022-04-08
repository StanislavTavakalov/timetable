package com.bntu.timetable.entity.studyplan;

import com.bntu.timetable.entity.BaseEntity;
import com.bntu.timetable.entity.Qualification;
import com.bntu.timetable.entity.Speciality;
import com.bntu.timetable.entity.studyplan.schedule.EducationalSchedule;
import com.bntu.timetable.entity.studyplan.structure.EducationForm;
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

    @Column(name = "is_standard_plan")
    private boolean isStandardPlan;

    @Column(name = "register_number", length = 1000)
    private String registerNumber;

    @Column
    private Integer semestersCount;

    @Column
    private Integer developmentYear;

    @OneToOne(mappedBy = "studyPlan")
    private EducationalSchedule educationalSchedule;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StudyPlanStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "education_form")
    private EducationForm educationForm;

    @ManyToOne
    @JoinColumn(name = "qualification_id")
    private Qualification qualification;

    @ManyToOne
    @JoinColumn(name = "speciality_id")
    private Speciality speciality;


}

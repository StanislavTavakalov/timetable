package com.bntu.timetable.entity;


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
@Table(name = "teacher")
public class Teacher extends BaseEntity {

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @ManyToOne
    @JoinColumn(name = "teacher_position_id")
    private TeacherPosition teacherPosition;

    @ManyToOne
    @JoinColumn(name = "academic_title_id")
    private AcademicTitle academicTitle;

    @ManyToOne
    @JoinColumn(name = "academic_degree_id")
    private AcademicDegree academicDegree;

    @Column(name = "additional_info", length = 10000)
    private String additionalInfo;

    @Enumerated(EnumType.STRING)
    @Column(name = "staff_type")
    private StaffType staffType;

    @ManyToOne
    @JoinColumn(name = "work_tariff_id")
    private WorkTariff workTariff;

    @Column(name = "hours")
    private Integer hours;

}

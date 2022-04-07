package com.bntu.timetable.entity.studyplan.structure;

import com.bntu.timetable.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "study_discipline")
public class StudyDiscipline extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private StudyDisciplineType studyDisciplineType;

    @ManyToOne
    @JoinColumn(name = "discipline_group_id")
    private StudyDisciplineGroup studyDisciplineGroup;

    @Column(name = "total_hours")
    private Integer totalHours;

    @Column(name = "classroom_hours")
    private Integer classroomHours;

    @Column(name = "credit_units")
    private Integer creditUnits;

    // TODO: implement University class
//    @ManyToOne
//    @JoinColumn(name = "university_id")
//    private University university;

    @Column(name = "university")
    private String university;

    @Column(name = "description", length = 10000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "study_component_id")
    @JsonIgnore
    private StudyComponent studyComponent;

}

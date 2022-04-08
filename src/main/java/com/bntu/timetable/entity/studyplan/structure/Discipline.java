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
@Table(name = "discipline")
public class Discipline extends BaseEntity {

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "description", length = 10000)
    private String description;

    @Column(name = "is_template")
    private Boolean isTemplate;

    @Column(name = "total_hours")
    private Double totalHours;

    @Column(name = "classroom_hours")
    private Double classroomHours;

    @Column(name = "credit_units")
    private Double creditUnits;

    @Enumerated(EnumType.STRING)
    private DisciplineType disciplineType;

    @ManyToOne
    @JoinColumn(name = "discipline_group_id")
    private DisciplineGroup disciplineGroup;

    @ManyToOne
    @JoinColumn(name = "component_id")
    @JsonIgnore
    private Component component;

    @ManyToOne
    @JoinColumn(name = "cycle_id")
    private Cycle cycle;

    // TODO: reimplement to University class
    @Column(name = "university")
    private String university;

    @Column(name = "position")
    private Integer position;

}

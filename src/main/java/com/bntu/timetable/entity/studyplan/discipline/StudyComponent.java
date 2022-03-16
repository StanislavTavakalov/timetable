package com.bntu.timetable.entity.studyplan.discipline;

import com.bntu.timetable.entity.BaseEntity;
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
@Table(name = "study_component")
public class StudyComponent extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private StudyComponentType studyComponentType;

    @Column(name = "total_hours")
    private Integer totalHours;

    @Column(name = "classroom_hours")
    private Integer classroomHours;

    @Column(name = "credit_units")
    private Integer creditUnits;

    @Column(name = "description", length = 10000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "study_cycle_id")
    private StudyCycle studyCycle;

    @OneToMany(mappedBy = "studyComponent")
    private List<StudyDiscipline> studyDisciplines;
}

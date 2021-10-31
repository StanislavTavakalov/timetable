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
@Table(name = "classroom")
public class Classroom extends BaseEntity {

    @Column(name = "number")
    private String number;

    @Column(name = "capacity")
    private String capacity;

    @ManyToOne
    @JoinColumn(name = "wing_id")
    private Wing wing;

    @ManyToOne
    @JoinColumn(name = "classroom_type_id")
    private ClassroomType classroomType;

    @ManyToOne
    @JoinColumn(name = "classroom_specialization_id")
    private ClassroomSpecialization classroomSpecialization;

    @Column(name = "start_point_x")
    private int startPointX;

    @Column(name = "start_point_y")
    private int startPointY;

    @Column(name = "end_point_x")
    private int endPointX;

    @Column(name = "end_point_y")
    private int endPointY;


}

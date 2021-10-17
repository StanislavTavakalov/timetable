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
public class Classroom extends BaseEntity {

    @Column(name = "number")
    private String number;

    @ManyToOne
    @JoinColumn(name = "wing_id", nullable = false)
    private Wing wing;

    @ManyToOne
    @JoinColumn(name = "classroom_type_id", nullable = false)
    private ClassroomType classroomType;

    @Column(name = "start_point_x")
    private int startPointX;

    @Column(name = "start_point_y")
    private int startPointY;

    @Column(name = "end_point_x")
    private int endPointX;

    @Column(name = "end_point_y")
    private int endPointY;


}

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
@Table(name = "classroom_type")
public class ClassroomType extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name ="color")
    private String color;

}

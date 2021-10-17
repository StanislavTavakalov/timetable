package com.bntu.timetable.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "color")
public class Color extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "color_r")
    private int colorR;

    @Column(name = "color_g")
    private int colorG;

    @Column(name = "color_b")
    private int colorB;

}
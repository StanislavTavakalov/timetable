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
@Table(name = "specialization")
public class Specialization extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

}
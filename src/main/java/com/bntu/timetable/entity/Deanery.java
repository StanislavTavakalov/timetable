package com.bntu.timetable.entity;

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
@Table(name = "deanery")
public class Deanery extends BaseEntity {

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "description", length = 10000)
    private String description;

    @OneToMany(mappedBy = "deanery")
    private List<Department> departments;

    @OneToMany(mappedBy = "deanery")
    private List<Flow> flows;

}

package com.bntu.timetable.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "department")
public class Department extends BaseEntity {

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "description", length = 10000)
    private String description;

    @Column(name = "code")
    private String code;

    @ManyToOne
    @JoinColumn(name = "deanery_id")
    @JsonIgnoreProperties(value = {"departments", "flows"}, allowSetters = true)
    private Deanery deanery;

    @OneToMany(mappedBy = "department")
    private List<Speciality> specialities;

}

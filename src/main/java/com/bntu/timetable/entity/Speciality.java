package com.bntu.timetable.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "speciality")
public class Speciality extends BaseEntity{

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "short_code")
    private String shortCode;

    @Column(name = "speciality_code")
    private String specialityCode;

    @Column(name = "description", length = 10000)
    private String description;

    @Column(name = "direction_name")
    private String directionName;

    @Column(name = "direction_code")
    private String directionCode;

    @Column(name = "specialization_name")
    private String specializationName;

    @Column(name = "specialization_code")
    private String specializationCode;

    @ManyToOne
    @JoinColumn(name = "department_id")
    @JsonIgnore
    private Department department;

    @OneToMany(mappedBy = "speciality")
    @JsonIgnore
    private List<StudyPlan> studyPlans;

    @OneToMany(mappedBy = "speciality", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Group> groups;
}

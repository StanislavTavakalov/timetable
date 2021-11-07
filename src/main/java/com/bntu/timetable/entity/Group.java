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
@Table(name = "study_group")
public class Group extends BaseEntity {

    @Column(name = "number")
    private String number;

    @Column(name = "count")
    private int count;

    @Column(name = "enter_year")
    private int enterYear;

    @ManyToOne
    @JoinColumn(name = "flow_id")
    @JsonIgnore
    private Flow flow;

    @OneToMany(mappedBy = "group")
    private List<Subgroup> subgroups;

}
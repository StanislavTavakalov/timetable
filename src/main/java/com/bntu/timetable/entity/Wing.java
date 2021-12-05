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
@Table(name = "wing")
public class Wing extends BaseEntity{

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "floor_id")
    private Floor floor;

    @OneToMany(mappedBy = "wing")
    @JsonIgnore
    private List<Classroom> classrooms;

    @Column(name = "plan_id")
    private String planId;

}

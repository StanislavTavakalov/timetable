package com.bntu.timetable.entity.studyplan.structure;

import com.bntu.timetable.entity.BaseEntity;
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
@Table(name = "cycle")
public class Cycle extends BaseEntity {

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "position")
    private Integer position;

    @Enumerated(EnumType.STRING)
    private CycleType cycleType;

    @OneToMany(mappedBy = "cycle")
    private List<Component> components;

    @OneToMany(mappedBy = "cycle")
    private List<Discipline> disciplines;


}

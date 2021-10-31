package com.bntu.timetable.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "subgroup")
public class Subgroup extends BaseEntity {

    @Column(name = "name")
    private int name;

    @Column(name = "count")
    private int count;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @JsonIgnore
    private Group group;
}

package com.bntu.timetable.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "building")
public class Building extends BaseEntity{

    @Column(name = "number")
    private String number;

    @Column(name = "description", length = 10000)
    private String description;

    @OneToMany(mappedBy = "building")
    private List<Floor> floors;


}

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

    @OneToMany(mappedBy = "building")
    @JsonIgnore
    private List<Floor> floors;


}

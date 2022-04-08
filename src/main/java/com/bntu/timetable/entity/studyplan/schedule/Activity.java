package com.bntu.timetable.entity.studyplan.schedule;

import com.bntu.timetable.entity.BaseEntity;
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
@Table(name = "activity")
// TODO: create CRUD
public class Activity extends BaseEntity {

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "symbol", length = 10)
    private String symbol;

    @OneToMany(mappedBy = "activity")
    private List<EducationalScheduleActivity> educationalScheduleActivities;

    @OneToMany(mappedBy = "activity")
    private List<EducationalScheduleTotalActivity> educationalScheduleTotalActivities;
}

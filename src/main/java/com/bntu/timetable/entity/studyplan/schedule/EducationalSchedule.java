package com.bntu.timetable.entity.studyplan.schedule;

import com.bntu.timetable.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "educational_schedule")
public class EducationalSchedule extends BaseEntity {

    @OneToMany(mappedBy = "educationalSchedule")
    private List<EducationalScheduleSemester> educationalScheduleSemesters;

    @OneToMany(mappedBy = "educationalSchedule")
    private List<EducationalScheduleTotalActivity> educationalScheduleTotalActivities;

}

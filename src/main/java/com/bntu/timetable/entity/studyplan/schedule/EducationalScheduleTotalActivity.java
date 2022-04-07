package com.bntu.timetable.entity.studyplan.schedule;


import com.bntu.timetable.entity.BaseEntity;
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
@Table(name = "educational_schedule_total_activity")
public class EducationalScheduleTotalActivity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "educational_schedule_id")
    private EducationalSchedule educationalSchedule;

    @Column(name = "total_week_count")
    private Double totalWeekCount;
}

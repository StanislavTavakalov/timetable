package com.bntu.timetable.entity.studyplan.schedule;

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
@Table(name = "educational_schedule_activity")
public class EducationalScheduleActivity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "educational_schedule_semester_id")
    private EducationalScheduleSemester educationalScheduleSemester;

    @ElementCollection
    @CollectionTable(name = "schedule_activity_to_week_number", joinColumns = @JoinColumn(name = "activity_id"))
    @Column(name = "week_number")
    private List<Integer> weekNumbers;
}

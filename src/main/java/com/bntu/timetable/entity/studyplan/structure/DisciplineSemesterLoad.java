package com.bntu.timetable.entity.studyplan.structure;

import com.bntu.timetable.entity.BaseEntity;
import com.bntu.timetable.entity.studyplan.schedule.Semester;
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
@Table(name = "discipline_semester_load")
public class DisciplineSemesterLoad extends BaseEntity {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "sem_loads_semesters",
            joinColumns = {@JoinColumn(name = "sem_load_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "semester_id", referencedColumnName = "id")},
            uniqueConstraints = @UniqueConstraint(columnNames = {
                    "sem_load_id", "semester_id"}))
    private List<Semester> semesters;

    @ManyToOne
    @JoinColumn(name = "semester_load_id")
    private SemesterLoad semesterLoad;

    @ManyToOne
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;
}

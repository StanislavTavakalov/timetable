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
@Table(name = "discipline_semester_load")
public class DisciplineSemesterLoad extends BaseEntity {

    @ElementCollection
    @CollectionTable(name = "sem_load_to_sem_number", joinColumns = @JoinColumn(name = "sem_load_id"))
    @Column(name = "sem_num")
    private List<Integer> semesterNumbers;

    @ManyToOne
    @JoinColumn(name = "semester_load_id")
    private SemesterLoad semesterLoad;

    @ManyToOne
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;
}

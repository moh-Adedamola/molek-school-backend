package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class TeacherSubjectAssignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer assignmentId;

    @ManyToOne
    private Teachers teacher;

    @ManyToOne
    private Subjects subject;

    @ManyToOne
    private ClassArms arm;

    @ManyToOne
    private AcademicYears academicYear;

    private String status;

    private LocalDate assignedDate;

    @ManyToOne
    private Admin assignedBy;
}
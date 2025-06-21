package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class StudentsArms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Students student;

    @ManyToOne
    private ClassArms arm;

    @ManyToOne
    private AcademicYears academicYear;

    private String status;

    private LocalDate assignedDate;

    @ManyToOne
    private Admin assignedBy;
}

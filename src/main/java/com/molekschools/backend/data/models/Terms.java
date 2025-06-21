package com.molekschools.backend.data.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Terms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer termId;

    @ManyToOne
    private AcademicYears academicYear;

    private String termName;

    private Integer termNumber;

    private LocalDate startDate;

    private LocalDate endDate;

    private String status;
}
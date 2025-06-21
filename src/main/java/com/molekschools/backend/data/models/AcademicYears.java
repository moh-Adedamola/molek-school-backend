package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class AcademicYears {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer academicYearId;

    private String yearName = "2024/2025";

    private LocalDate startDate;

    private LocalDate endDate;

    private String status;

    @ManyToOne
    private Admin createdBy;
}

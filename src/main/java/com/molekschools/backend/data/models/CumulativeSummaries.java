package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class CumulativeSummaries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cumulativeId;

    @ManyToOne
    private Students student;

    @ManyToOne
    private AcademicYears academicYear;

    @ManyToOne
    private ClassArms arm;

    private Double term1Total;

    private Double term2Total;

    private Double term3Total;

    private Double cumulativeTotal;

    private Double cumulativeAverage;

    private Integer finalPosition;

    private String promotionStatus;

    private LocalDateTime createdAt = LocalDateTime.now();
}

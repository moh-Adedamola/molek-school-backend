package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class TermSummaries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer summaryId;

    @ManyToOne
    private Students student;

    @ManyToOne
    private Terms term;

    @ManyToOne
    private ClassArms arm;

    private Double totalMarks;

    private Double averageMarks;

    private Integer totalSubjects;

    private Integer positionInClass;

    private Double attendancePercentage;

    private String overallGrade;

    private String teacherComment;

    private String principalComment;

    private String status;

    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    private Admin createdBy;
}

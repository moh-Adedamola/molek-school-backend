package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class StudentGrades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gradeId;

    @ManyToOne
    private Students student;

    @ManyToOne
    private Subjects subject;

    @ManyToOne
    private Teachers teacher;

    @ManyToOne
    private ClassArms arm;

    @ManyToOne
    private Terms term;

    private Double caScore;

    private Double examScore;

    private Double totalScore;

    private String gradeLetter;

    private String remarks;

    private LocalDateTime recordedAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();
}

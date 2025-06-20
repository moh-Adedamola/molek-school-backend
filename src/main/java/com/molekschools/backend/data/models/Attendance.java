package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attendanceId;

    @ManyToOne
    private Students student;

    @ManyToOne
    private ClassArms arm;

    @ManyToOne
    private Teachers teacher;

    private LocalDate attendanceDate;

    private String status;

    private String remarks;

    private LocalDateTime recordedAt = LocalDateTime.now();

    @ManyToOne
    private Teachers recordedBy;
}

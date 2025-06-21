package com.molekschools.backend.data.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherId;

    @ManyToOne
    private Users user;

    private String employeeId;

    private String qualification;

    private String specialization;

    private LocalDate hireDate;

    private String status;

    private LocalDateTime approvedAt;

    @ManyToOne
    private Users approvedBy;
}

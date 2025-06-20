package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;

    @ManyToOne
    private Users user;

    private Integer employeeId;

    private LocalDateTime hireDate;

    private String status;

    private LocalDateTime approvedAt;

    @ManyToOne
    private Users approvedBy;
}

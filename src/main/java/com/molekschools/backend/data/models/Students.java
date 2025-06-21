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
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String uniqueId;

    private String email;

    private String phone;

    private String firstName;

    private String lastName;

    private String middleName;

    private LocalDate dateOfBirth;

    private String gender;

    private String address;

    private String stateOfOrigin;

    private String nationality;

    private String bloodGroup;

    private String medicalInfo;

    private LocalDate admissionDate;

    private String status;

    @ManyToOne
    private Admin createdBy;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();
}

package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long userId;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String role;
    private String status = "active";
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    @ManyToOne
    @JoinColumn(name = "approved_by")
    private Users approvedBy;
}

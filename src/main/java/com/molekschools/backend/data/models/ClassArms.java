package com.molekschools.backend.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ClassArms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer armId;

    @ManyToOne
    private Classes classEntity;

    private String armName;

    private Integer capacity;

    private String status;

    @ManyToOne
    private Admin createdBy;
}
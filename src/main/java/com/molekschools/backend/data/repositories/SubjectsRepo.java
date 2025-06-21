package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepo extends JpaRepository<Subjects, Integer> {
}

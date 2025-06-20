package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students, Integer> {
}

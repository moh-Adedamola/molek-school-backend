package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.AcademicYears;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicYearsRepo extends JpaRepository<AcademicYears, Integer> {
}

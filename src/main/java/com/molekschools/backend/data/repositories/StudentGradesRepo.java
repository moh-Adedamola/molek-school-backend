package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.StudentGrades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGradesRepo extends JpaRepository<StudentGrades,Integer> {
}

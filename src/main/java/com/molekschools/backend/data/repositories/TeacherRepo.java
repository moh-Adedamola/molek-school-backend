package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teachers, Integer> {
}

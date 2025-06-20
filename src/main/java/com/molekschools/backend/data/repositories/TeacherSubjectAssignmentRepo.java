package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.TeacherSubjectAssignments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherSubjectAssignmentRepo extends JpaRepository <TeacherSubjectAssignments, Integer> {
}

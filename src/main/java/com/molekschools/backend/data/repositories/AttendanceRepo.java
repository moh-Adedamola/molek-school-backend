package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepo extends JpaRepository<Attendance,Integer> {
}

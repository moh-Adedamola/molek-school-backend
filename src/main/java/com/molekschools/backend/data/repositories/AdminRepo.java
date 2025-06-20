package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}

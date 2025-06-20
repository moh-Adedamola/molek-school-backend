package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepo extends JpaRepository<Classes, Integer> {
}

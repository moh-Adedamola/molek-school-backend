package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Terms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermsRepo extends JpaRepository<Terms, Integer> {
}

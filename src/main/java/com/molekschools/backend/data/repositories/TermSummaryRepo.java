package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.TermSummaries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermSummaryRepo extends JpaRepository<TermSummaries,Integer> {
}

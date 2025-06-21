package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.CumulativeSummaries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CumulativeSummariesRepo extends JpaRepository<CumulativeSummaries,Integer> {
}

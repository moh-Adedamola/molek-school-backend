package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Integer> {

}

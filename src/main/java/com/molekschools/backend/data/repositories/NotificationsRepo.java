package com.molekschools.backend.data.repositories;

import com.molekschools.backend.data.models.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationsRepo extends JpaRepository<Notifications, Integer> {
}

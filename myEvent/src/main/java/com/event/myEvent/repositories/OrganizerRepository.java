package com.event.myEvent.repositories;

import com.event.myEvent.models.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
}

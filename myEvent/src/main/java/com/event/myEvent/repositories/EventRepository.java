package com.event.myEvent.repositories;

import com.event.myEvent.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}

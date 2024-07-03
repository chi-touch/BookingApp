package com.event.myEvent.services;

import com.event.myEvent.dto.request.CreateEventRequest;
import com.event.myEvent.dto.response.CreateEventResponse;
import com.event.myEvent.models.Event;

public interface EventService {
    CreateEventResponse createEvent(CreateEventRequest createEventRequest);

    Event getId(long id);
}

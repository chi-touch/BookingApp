package com.event.myEvent.services;

import com.event.myEvent.dto.request.AddTicketToEventRequest;
import com.event.myEvent.dto.request.OrganizerRegisterRequest;
import com.event.myEvent.dto.response.AddTicketToEventResponse;
import com.event.myEvent.dto.response.OrganizerRegisterResponse;

public interface OrganizerService {
    OrganizerRegisterResponse registerOrganizer(OrganizerRegisterRequest registerRequest);

    AddTicketToEventResponse addTicketEvent(AddTicketToEventRequest addEventRequest);
}

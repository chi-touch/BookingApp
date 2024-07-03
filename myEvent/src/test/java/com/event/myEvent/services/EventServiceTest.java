package com.event.myEvent.services;

import com.event.myEvent.dto.request.CreateEventRequest;
import com.event.myEvent.dto.response.CreateEventResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Sql(scripts = {"/db/data.sql"})
public class EventServiceTest {

    @Autowired
    private EventService eventService;

    @Test
    public void testToCreateEvent(){
        CreateEventRequest createEventRequest = new CreateEventRequest();
        createEventRequest.setId(100L);
        createEventRequest.setLocation("Lagos");
        createEventRequest.setEventName("birthdayParty");
        createEventRequest.setStartDate(LocalDateTime.now());
        createEventRequest.setEndDate(LocalDateTime.now().plusDays(1));
        CreateEventResponse createEventResponse =eventService.createEvent(createEventRequest);
        assertNotNull(createEventResponse);
        assertEquals("Event is created successful", createEventResponse.getMessage());

    }

}

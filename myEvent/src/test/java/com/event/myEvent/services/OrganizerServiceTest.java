package com.event.myEvent.services;

import com.event.myEvent.dto.request.AddTicketToEventRequest;
import com.event.myEvent.dto.request.OrganizerRegisterRequest;
import com.event.myEvent.dto.response.AddTicketToEventResponse;
import com.event.myEvent.dto.response.OrganizerRegisterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static com.event.myEvent.models.TicketCategory.REGULAR;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class OrganizerServiceTest {

    @Autowired
    private OrganizerService organizerService;

    @Test
    public void testThatOrganizerCanRegister(){
        OrganizerRegisterRequest registerRequest = new OrganizerRegisterRequest();
        registerRequest.setFirstName("name");
        registerRequest.setLastName("name1");
        registerRequest.setEmail("name@gmail.com");
        registerRequest.setPassword("1234");
        OrganizerRegisterResponse registerResponse = organizerService.registerOrganizer(registerRequest);
        assertNotNull(registerResponse);
        assertTrue(registerResponse.getMessage().contains("successful"));
    }

    @Test
    public void testToAddEvent(){
        AddTicketToEventRequest addEventRequest = new AddTicketToEventRequest();
        addEventRequest.setEventId(100L);
        addEventRequest.setOrganizerId(10L);
        addEventRequest.setPrice(BigDecimal.valueOf(2000));
        addEventRequest.setTicketCategory(REGULAR);
        AddTicketToEventResponse addEventResponseResponse = organizerService.addTicketEvent(addEventRequest);

        assertNotNull(addEventResponseResponse);
        assertTrue(addEventResponseResponse.getMessage().contains("successful"));
    }



}

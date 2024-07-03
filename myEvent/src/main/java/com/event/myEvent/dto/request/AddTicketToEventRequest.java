package com.event.myEvent.dto.request;

import com.event.myEvent.models.TicketCategory;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AddTicketToEventRequest {
    private Long organizerId;
    private Long eventId;
    private TicketCategory ticketCategory;
    private BigDecimal price;
}

package com.event.myEvent.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Event event;
    private BigDecimal ticketPrice;
    private TicketCategory ticketCategory;
    @OneToOne
    private EventUser eventUser;

}

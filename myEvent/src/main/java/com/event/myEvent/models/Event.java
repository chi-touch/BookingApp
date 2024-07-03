package com.event.myEvent.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Organizer organizer;
    private String eventName;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)

    private LocalDateTime startDate;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime endDate;
    private String location;
    @Enumerated(EnumType.STRING)
    private TicketCategory ticketCategory;



//    public static void main(String[] args) {
//        LocalDateTime startDate =LocalDateTime.now();
//        LocalDateTime endDate =startDate.plusDays(1);
//        System.out.println(startDate);
//        System.out.println(endDate);
//    }

}





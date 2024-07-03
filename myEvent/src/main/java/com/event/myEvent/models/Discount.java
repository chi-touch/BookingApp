package com.event.myEvent.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Discount {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String code;
        private double percentage;
        @OneToOne
        private Event event;
    }


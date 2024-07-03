package com.event.myEvent.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "organizer")
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @OneToMany
    private List<Event> eventList;
    @Column(unique = true)
    private String email;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Discount> discountList;










}

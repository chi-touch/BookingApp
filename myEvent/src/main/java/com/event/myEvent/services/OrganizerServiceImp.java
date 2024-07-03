package com.event.myEvent.services;

import com.event.myEvent.dto.request.AddTicketToEventRequest;
import com.event.myEvent.dto.request.OrganizerRegisterRequest;
import com.event.myEvent.dto.response.AddTicketToEventResponse;
import com.event.myEvent.dto.response.OrganizerRegisterResponse;
import com.event.myEvent.models.Organizer;
import com.event.myEvent.models.Ticket;
import com.event.myEvent.repositories.OrganizerRepository;
import com.event.myEvent.repositories.TicketRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OrganizerServiceImp implements OrganizerService {

    private final ModelMapper modelMapper;
    private final TicketRepository ticketRepository;
    private final OrganizerRepository organizerRepository;

    public OrganizerServiceImp(ModelMapper modelMapper, TicketRepository ticketRepository, OrganizerRepository organizerRepository) {
        this.modelMapper = modelMapper;
        this.ticketRepository = ticketRepository;
        this.organizerRepository = organizerRepository;
    }

    @Override
    public OrganizerRegisterResponse registerOrganizer(OrganizerRegisterRequest registerRequest) {
        ModelMapper modelMapper = new ModelMapper();
        Organizer organizer = modelMapper.map(registerRequest,Organizer.class);
        Organizer savedUser = organizerRepository.save(organizer);
        var response = modelMapper.map(savedUser,OrganizerRegisterResponse.class);
        response.setMessage("Organizer registered successful");
        return response;
    }

    @Override
    public AddTicketToEventResponse addTicketEvent(AddTicketToEventRequest addEventRequest) {
        Ticket ticket = new Ticket();
        ticket.setTicketCategory(ticket.getTicketCategory());
        ticket.setTicketPrice(ticket.getTicketPrice());
        ticket.setEvent(ticket.getEvent());
        ticket = ticketRepository.save(ticket);

//       Organizer organizer = modelMapper.map(addEventRequest,Organizer.class);
//        Organizer savedUser = organizerRepository.save(organizer);
//        var response = modelMapper.map(savedUser,AddTicketToEventResponse.class);
//        response.setMessage("Organizer registered successful");
        var response = modelMapper.map(ticket,AddTicketToEventResponse.class);
        response.setMessage("Organizer registered successful");
        return response;


    }
}

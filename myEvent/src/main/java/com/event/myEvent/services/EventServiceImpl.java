package com.event.myEvent.services;

import com.event.myEvent.dto.request.CreateEventRequest;
import com.event.myEvent.dto.response.CreateEventResponse;
import com.event.myEvent.dto.response.OrganizerRegisterResponse;
import com.event.myEvent.exceptions.EventNotFoundException;
import com.event.myEvent.models.Event;
import com.event.myEvent.models.Organizer;
import com.event.myEvent.repositories.EventRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    private final ModelMapper modelMapper;
    private final EventRepository eventRepository;

    public EventServiceImpl(ModelMapper modelMapper, EventRepository eventRepository) {
        this.modelMapper = modelMapper;
        this.eventRepository = eventRepository;
    }


    @Override
    public CreateEventResponse createEvent(CreateEventRequest createEventRequest) {
        ModelMapper modelMapper = new ModelMapper();
        Event event = modelMapper.map(createEventRequest,Event.class);
        Event savedUser = eventRepository.save(event);
        var response = modelMapper.map(savedUser, CreateEventResponse.class);
        response.setMessage("Event is created successful");
        return response;
    }

    @Override
    public Event getId(long id) {
        return eventRepository.findById(id)
                .orElseThrow(()->new EventNotFoundException(
                        String.format("event is not found")
                ));
    }


}

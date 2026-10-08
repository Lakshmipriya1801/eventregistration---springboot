package com.example.eventregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventregistration.dao.EventRepo;
import com.example.eventregistration.entity.Event;

@Service
public class EventService {

    @Autowired
    EventRepo repo;

    public Event addEvent(Event event) {
        return repo.save(event);
    }

    public List<Event> getEvents() {
        return repo.findAll();
    }

    public Event getEvent(int id) {
        return repo.findById(id).orElse(null);
    }
}

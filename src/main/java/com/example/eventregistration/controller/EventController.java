package com.example.eventregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.eventregistration.entity.Event;
import com.example.eventregistration.service.EventService;


@RestController
@RequestMapping("/events")
public class EventController {

	

	    @Autowired
	    EventService service;

	    @PostMapping
	    public Event addEvent(@RequestBody Event event) {
	        return service.addEvent(event);
	    }

	    @GetMapping
	    public List<Event> getEvents() {
	        return service.getEvents();
	    }

	    @GetMapping("/{id}")
	    public Event getEvent(@PathVariable int id) {
	        return service.getEvent(id);
	    }
	}
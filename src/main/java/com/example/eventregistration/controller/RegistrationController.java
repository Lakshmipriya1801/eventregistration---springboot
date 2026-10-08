package com.example.eventregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.eventregistration.entity.Registration;
import com.example.eventregistration.service.RegistrationService;


@RestController
@RequestMapping("/registrations")
public class RegistrationController {


	    @Autowired
	    RegistrationService service;

	    @PostMapping
	    public Registration register(@RequestBody Registration registration) {
	        return service.register(registration);
	    }

	    @GetMapping("/user/{userId}")
	    public List<Registration> getUserRegistrations(@PathVariable int userId) {
	        return service.getUserRegistrations(userId);
	    }

	    @DeleteMapping("/{id}")
	    public String cancelRegistration(@PathVariable int id) {
	        return service.cancelRegistration(id);
	    }
	}
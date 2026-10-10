
package com.example.eventregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventregistration.dao.RegistrationRepo;
import com.example.eventregistration.entity.Registration;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepo repo;

    public Registration register(Registration registration) {
        return repo.save(registration);
    }

    public List<Registration> getUserRegistrations(int userId) {
        return repo.findByUserId(userId);
    }

    public String cancelRegistration(int id) {
        if (!repo.existsById(id)) {
            return "Registration not found";
        }

        repo.deleteById(id);
        return "Registration cancelled successfully";
    }
}

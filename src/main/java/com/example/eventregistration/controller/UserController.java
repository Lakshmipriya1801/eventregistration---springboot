package com.example.eventregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.eventregistration.dao.UserRepo;
import com.example.eventregistration.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepo repo;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }
}
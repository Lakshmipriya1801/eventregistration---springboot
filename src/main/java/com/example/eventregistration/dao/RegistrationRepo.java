package com.example.eventregistration.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventregistration.entity.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

    List<Registration> findByUserId(int userId);
}

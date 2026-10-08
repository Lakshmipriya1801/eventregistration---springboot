package com.example.eventregistration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

     int userId;
     int eventId;
     

    public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public Registration(int userId, int eventId) {
		super();
		this.userId = userId;
		this.eventId = eventId;
	}


	public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}

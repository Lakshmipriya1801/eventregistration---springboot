package com.example.eventregistration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String description;
	String date;
	String location;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(String name, String description, String date, String location) {
		super();
		this.name = name;
		this.description = description;
		this.date = date;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}

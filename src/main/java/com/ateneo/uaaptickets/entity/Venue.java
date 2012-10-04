package com.ateneo.uaaptickets.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.sun.istack.internal.NotNull;

@Entity(name="venue")
public class Venue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	@NotNull
	private int id;
	
	@Column(name="venue_name", unique=true)
	@NotNull
	private String name;
	
	@Column(name="venue_location")
	@NotNull
	private String location;
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@OneToMany(mappedBy="venue")
	private List<Event> event;

	public List<Event> getEvent() {
		return event;
	}
	public void setEvent(List<Event> event) {
		this.event = event;
	}
	
	
}

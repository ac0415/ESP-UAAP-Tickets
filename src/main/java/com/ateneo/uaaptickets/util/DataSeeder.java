package com.ateneo.uaaptickets.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ateneo.uaaptickets.entity.Venue;
import com.ateneo.uaaptickets.repository.VenueRepository;

import com.ateneo.uaaptickets.entity.Role;
import com.ateneo.uaaptickets.repository.RoleRepository;

@Profile("dataSeeder")
@Component
public class DataSeeder 
{
	@Autowired
	private VenueRepository venueRepository;

	@Autowired
	private RoleRepository roleRepository;
	
	@PostConstruct
	public void run() 
	{
		Role adminRole = new Role();
		adminRole.setName("ORGANIZER");
		adminRole = roleRepository.save(adminRole);
		
		Role userRole = new Role();
		userRole.setName("USER");
		userRole = roleRepository.save(userRole);
		
		Venue venue1 = new Venue();
		venue1.setName("Araneta Coliseum");
		venue1 = venueRepository.save(venue1);
		
		Venue venue2 = new Venue();
		venue2.setName("MOA Arena");
		venue2 = venueRepository.save(venue2);
	}
}


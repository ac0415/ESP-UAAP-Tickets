package com.ateneo.uaaptickets.controller;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.retail.entity.Venue;

@Repository
public class VenueRepository extends JpaRepository<Venue, Integer>{
	List<Venue> findByName(String name);
	List<Venue> findByLocation(String location);
}

package com.ateneo.uaaptickets.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateneo.uaaptickets.entity.Event;

@Repository
public class EventRepository extends JpaRepository<Event, Integer>{
	List<Event> findByName(String name);
	List<Event> findByDate(String date);
	List<Event> findByVenue(Venue venue);
}

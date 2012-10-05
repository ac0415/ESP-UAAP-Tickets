package com.ateneo.uaaptickets.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ateneo.uaaptickets.repository.*;
import com.ateneo.uaaptickets.util.*;
import com.ateneo.uaaptickets.entity.Event;
@Controller
@RequestMapping("/event")
public class EventController {

	@Autowired
	private EventRepository eventRepository;

//	@Autowired
//	private AccountRepository accountRepository;
//
//	@Autowired
//	private StudentRepository studentRepository;

	@Autowired
	private EventValidator eventValidator;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(Model uiModel) {
		List<Event> events = eventRepository.findAll();
		uiModel.addAttribute("events", events);
		return "event/index";
	}
	
	//already in ticketController
	@RequestMapping(value={"/event/{id}"})
	public String event(@PathVariable("id") Integer id, Model uiModel)
	{
		Event e = eventRepository.findOne(id);
		uiModel.addAttribute("event", e);
		return "eventPage";
	}

	@RequestMapping(value="/create")
	@PreAuthorize("hasRole('ADMIN')")
	public String create(Model uiModel) {
		
		uiModel.addAttribute("event", new Event());
		
		return "event/create";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(Event event, BindingResult result, HttpServletRequest request, Model uiModel)
	{
		eventValidator.validate(event, result);
		if(result.hasErrors()) {
			uiModel.addAttribute("errors", result.getAllErrors());
			uiModel.addAttribute("event", event);
			
			return "event/create";
		}
		
		event = eventRepository.save(event);
		
		return  "redirect:/event";
	}

}

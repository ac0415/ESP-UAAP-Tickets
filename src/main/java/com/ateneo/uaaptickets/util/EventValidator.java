package com.ateneo.uaaptickets.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ateneo.uaaptickets.entity.Event;
import com.ateneo.uaaptickets.repository.EventRepository;


@Component("eventValidator")
public class EventValidator implements Validator{
	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Event.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		Event event = (Event)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "date", null, "Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "time", null, "Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "venue", null, "Required");
	}
}

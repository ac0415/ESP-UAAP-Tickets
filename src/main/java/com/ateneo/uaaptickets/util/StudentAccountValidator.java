package com.ateneo.uaaptickets.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ateneo.uaaptickets.entity.StudentAccount;
import com.ateneo.uaaptickets.repository.AccountRepository;
import com.ateneo.uaaptickets.repository.StudentRepository;

public class StudentAccountValidator {
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return StudentAccount.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		StudentAccount studentAccount = (StudentAccount)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", null, "Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", null, "Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", null, "Required");
		
		// Check for uniqueness of username
		if(studentRepository.findByUsername(studentAccount.getUsername()) != null) {
			errors.rejectValue("username", null, "Username already in use! Please choose another one.");
		}
		
		// Check for uniqueness of email
		if(studentRepository.findByEmail(studentAccount.getEmail()) != null) {
			errors.rejectValue("email", null, "Email already used!");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", null, "Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", null, "Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "catchPhrase", null, "Required");
	}
}

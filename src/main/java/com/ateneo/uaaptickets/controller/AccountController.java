package com.ateneo.uaaptickets.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ateneo.uaaptickets.entity.Student;
import com.ateneo.uaaptickets.repository.StudentRepository;
import com.ateneo.uaaptickets.repository.AccountRepository;
import com.ateneo.uaaptickets.service.AccountManagementService;

@Controller
public class AccountController{

	@Autowired
	private AccountManagementService accountManagementService;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/profile")
	@PreAuthorize("hasRole('USER')")
	public String profile(Model uiModel, Principal principal)
	{
		Student student = studentRepository.findByAccount(accountRepository.findByUsername(principal.getName()));
		uiModel.addAttribute("student", student);
		
		return "student/profile";
	}

}

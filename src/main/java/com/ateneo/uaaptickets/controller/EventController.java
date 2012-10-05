package com.ateneo.uaaptickets.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping(value={"/", "/index", ""})
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value={"/login"})
	public String login()
	{
		return "login";
	}
	
	/*
	 * Example uses of @PreAuthorize to authorize a particular method
	 */
	@RequestMapping("/sample-admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String sampleAdminPage()
	{
		return "sampleAdmin";
	}
	
	@RequestMapping("/sample-user")
	@PreAuthorize("hasRole('USER')")
	public String sampleUserPage()
	{
		return "sampleUser";
	}
}

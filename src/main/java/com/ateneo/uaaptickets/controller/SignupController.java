package com.ateneo.uaaptickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ateneo.uaaptickets.repository.*;

@Controller
@RequestMapping("/signup")
public class SignupController {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private VenueRepository venueRepository;

	@Autowired
	private AccountManagementService accountManagementService;
	
	@Autowired
	private StudentAccountValidator studentAccountValidator;

	//redirects to signup page
	@RequestMapping(value={"", "/", "/index"})
	public String signup(Model uiModel)
	{
		uiModel.addAttribute("studentAccount", new StudentAccount());
		return "signup/index";
	}
	
	@RequestMapping(value={"/save"}, method=RequestMethod.POST)
	public String save(StudentAccount studentAccount, BindingResult result, 
			Model uiModel, HttpServletRequest request, RedirectAttributes redirectAttributes)
	{
		studentAccountValidator.validate(studentAccount, result);
		if(result.hasErrors()) {
			uiModel.addAttribute("studentAccount", studentAccount);
			uiModel.addAttribute("errors", result.getAllErrors());
			uiModel.addAttribute("ERROR_MESSAGE", "Some errors occured");
			
			return "signup/index";
		}
		
		// Build the user
		Account account = new Account();
		account.setUsername(userAccount.getUsername());
		account.setPassword(userAccount.getPassword());
		account.setEmail(userAccount.getEmail());
		account = accountManagementService.saveNewUser(account);
		
		
		// Build the account
		Student student = new Student();
		student.setFirstName(studentAccount.getFirstName());
		student.setMiddleName(studentAccount.getMiddleName());
		student.setLastName(studentAccount.getLastName());
		student.setCatchPhrase(studentAccount.getCatchPhrase());
		
		// Set the confirmation string.
		// TODO: Handle errors properly
		try {
			student.setConfirmationString(AeSimpleMD5.MD5(user.getUsername()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		student.setAccount(account);
		student = accountRepository.save(student);
		
	
		redirectAttributes.addFlashAttribute("SUCCESS_MESSAGE", "Account was successfully created! You may now start using UaapTickets. Thank you ^_^");
		
		return "redirect:/";
	}
	
	@RequestMapping("/confirm/{confirmationString}")
	public String confirm(@PathVariable("confirmationString") String confirmationString, 
			RedirectAttributes redirectAttributes)
	{
		Student student = accountRepository.findByConfirmationString(confirmationString);
		
		if(student != null) {
			Account account = student.getAccount();
			account.setIsEnabled(true);
			account = accountRepository.save(account);
			redirectAttributes.addFlashAttribute("SUCCESS_MESSAGE", "Successfully enabled account.");
		} else {
			redirectAttributes.addFlashAttribute("ERROR_MESSAGE", "Account does not exist. Please sign up");
		}
		
		return "redirect:/";
	}
}

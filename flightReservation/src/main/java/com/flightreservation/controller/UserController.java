package com.flightreservation.controller;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.flightreservation.entitis.User;
import com.flightreservation.repos.UserRepository;

@Controller
@Transactional
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "registerUser";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "login";

	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap){
		User user = userRepository.findByEmail(email);
		if(user.getPassword().equals(password) && user.getEmail().equals(email)){
			return "findFlights";
		}
		else{
			modelMap.addAttribute("msg","Invalid user name or password. Please try again.");
		}
		return "login";
		
	}
}

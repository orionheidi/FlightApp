package com.flightcheckin.controllers;




import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.flightcheckin.dto.Reservation;
import com.flightcheckin.integration.ReservationClient;


@Controller
@Transactional
public class CheckInController {
	
	@Autowired
	ReservationClient restClient;
	
	@RequestMapping("/showStartCheckin")
	public String showStartCheckIn(){
		return "startCheckIn";	
	}
	


	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id") Long id, @RequestBody Reservation reservation, ModelMap modelMap){
		reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		return "displayResrvationDetails";
	}
}

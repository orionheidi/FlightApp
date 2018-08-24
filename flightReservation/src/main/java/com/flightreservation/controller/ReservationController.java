package com.flightreservation.controller;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.dto.ResrevationRequest;
import com.flightreservation.entitis.Flight;
import com.flightreservation.entitis.Reservation;
import com.flightreservation.repos.FlightRepository;
import com.flightreservation.services.ReservationService;

@Controller
@Transactional
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompletedReservation(@RequestParam("FlightId") Long flightId, ModelMap modelMap){
		Flight flight = flightRepository.getOne(flightId);
		modelMap.addAttribute("flight",flight);	
		return "completeReservation";
		
	}
	
	@RequestMapping(value="/completeReservation", method = RequestMethod.POST)
	public String completeReservation(ResrevationRequest request, ModelMap modelMap){
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg","Reservation created successfully" + reservation.getId());
		return "reservationConfirmation";
		
	}
}

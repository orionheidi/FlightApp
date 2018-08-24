package com.flightreservation.controller;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.flightreservation.dto.ResrvationUpdateRequest;
import com.flightreservation.entitis.Reservation;
import com.flightreservation.repos.ReservationRepository;


@RestController
@RequestMapping(value = "/reservations")
@Transactional
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	
	@GetMapping("/{id}")
	public Optional<Reservation> findReservation(@PathVariable("id") Long id, @RequestBody Optional<Reservation> reservation){
		if(id == null){
			System.out.println(HttpStatus.NOT_FOUND);
		}
		reservation = reservationRepository.findById(id);
		return reservation;
		
	}
	
	@PutMapping("/{id}")
	public Reservation updateReservation(@RequestBody ResrvationUpdateRequest request){
		Reservation reservation = reservationRepository.getOne(request.getId());
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		return reservationRepository.save(reservation);	
	}
	
	@GetMapping
	public List<Reservation> getLocations(){
		return reservationRepository.findAll();
		
	}
	
	

}

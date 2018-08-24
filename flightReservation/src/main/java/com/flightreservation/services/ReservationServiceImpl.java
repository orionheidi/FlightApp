package com.flightreservation.services;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservation.dto.ResrevationRequest;
import com.flightreservation.entitis.Flight;
import com.flightreservation.entitis.Passanger;
import com.flightreservation.entitis.Reservation;
import com.flightreservation.repos.FlightRepository;
import com.flightreservation.repos.PassangerRepository;
import com.flightreservation.repos.ReservationRepository;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassangerRepository passangerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	

	@Override
	public Reservation bookFlight(ResrevationRequest request) {
		
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.getOne(flightId);
		
		Passanger passanger = new Passanger();
		passanger.getId();
		passanger.setId(passanger.getId());
		passanger.setFirstName(request.getFirstName());
		passanger.setLastName(request.getLastName());
		passanger.setPhone(request.getPhone());
		passanger.setEmail(request.getEmail());
		Passanger savedPassanger = passangerRepository.save(passanger);
		
		Reservation reservation = new Reservation();
		reservation.getId();
		reservation.setId(reservation.getId());
		reservation.setFlight(flight);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		reservation.setPassanger(savedPassanger);
		
		Reservation savedReservation = reservationRepository.save(reservation);
		
	
		return savedReservation;
	}

	@Override
	public Reservation findOne(Long id) {
		return reservationRepository.getOne(id);
	}

	@Override
	public Reservation saveReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public void deleteLocation(Long id) {
		reservationRepository.deleteById(id);
		
	}

	@Override
	public List<Reservation> getAllReservations() {
		return reservationRepository.findAll();
	}

}

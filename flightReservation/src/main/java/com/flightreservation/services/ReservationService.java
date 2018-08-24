package com.flightreservation.services;

import java.util.List;

import javax.transaction.Transactional;

import com.flightreservation.dto.ResrevationRequest;
import com.flightreservation.entitis.Reservation;

@Transactional
public interface ReservationService {

	public Reservation bookFlight(ResrevationRequest request);

	public Reservation findOne(Long id);

	public Reservation saveReservation(Reservation reservation);

	public Reservation updateReservation(Reservation reservation);

	void deleteLocation(Long id);

	public List<Reservation> getAllReservations();

	

}

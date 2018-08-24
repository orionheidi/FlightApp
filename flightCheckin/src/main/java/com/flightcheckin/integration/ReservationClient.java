package com.flightcheckin.integration;

import java.util.Optional;

import com.flightcheckin.dto.Reservation;
import com.flightcheckin.dto.ResrvationUpdateRequest;

public interface ReservationClient {
	

	public Reservation updateReservation(ResrvationUpdateRequest request);

	//public Reservation findReservation(Long id, Reservation reservation);

	public Reservation findReservation(Long id);

	
	

}

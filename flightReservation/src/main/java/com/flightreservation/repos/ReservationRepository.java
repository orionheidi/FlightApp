package com.flightreservation.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.flightreservation.entitis.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {


	  Optional<Reservation> findById(@PathVariable Long id);

}

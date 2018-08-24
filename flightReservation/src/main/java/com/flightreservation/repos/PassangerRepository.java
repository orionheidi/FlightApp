package com.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.flightreservation.entitis.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Long> {

}

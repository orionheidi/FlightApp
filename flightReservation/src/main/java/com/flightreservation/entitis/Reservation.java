package com.flightreservation.entitis;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private boolean checkedIn;
	private int numberOfBags;


	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@OneToOne
	/*(mappedBy = "reservation", cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY)*/
	private Passanger passanger;
	
	@OneToOne
	/*(mappedBy = "reservation", cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY)*/
	private Flight flight;
	

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passanger getPassanger() {
		return passanger;
	}

	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}

package com.flightreservation.dto;

public class ResrvationUpdateRequest {
	
	private Long id;
	private Boolean  checkedIn;
	private int numberOfBags;
	


	public Boolean getCheckedIn() {
		return checkedIn;
	}


	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}


	public int getNumberOfBags() {
		return numberOfBags;
	}


	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id){
		this.id = id;
	}
	

}

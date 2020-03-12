package com.hcl.training.sbflightbooking.request;

import java.sql.Timestamp;

public class FlightBookingDetailsRequest {

	private String mealstatus;

	private Timestamp bookingDate;

	private FlightDetailsRequest flightDetails;

	private UserDetailsRequest userDetails;

	public String getMealstatus() {
		return mealstatus;
	}

	public void setMealstatus(String mealstatus) {
		this.mealstatus = mealstatus;
	}

	public Timestamp getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}

	public FlightDetailsRequest getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(FlightDetailsRequest flightDetails) {
		this.flightDetails = flightDetails;
	}

	public UserDetailsRequest getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetailsRequest userDetails) {
		this.userDetails = userDetails;
	}

}

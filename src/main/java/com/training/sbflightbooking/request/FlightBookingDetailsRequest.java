package com.training.sbflightbooking.request;

import java.sql.Timestamp;

public class FlightBookingDetailsRequest {

	private String mealstatus;

	private Timestamp bookingDate;

	private PassengerDetails userDetails;

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

	

	public PassengerDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(PassengerDetails userDetails) {
		this.userDetails = userDetails;
	}

}

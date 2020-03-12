package com.hcl.training.sbflightbooking.request;

import java.sql.Timestamp;

public class FlightDetailsRequest {
	
	private String airline;
	
	private String source;
	
	private String destination;
	
	private long seats;
	
	private Timestamp date;
	
	private long fareAmt;
	
	private FlightBookingDetailsRequest fltbooking;

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public long getSeats() {
		return seats;
	}

	public void setSeats(long seats) {
		this.seats = seats;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public long getFareAmt() {
		return fareAmt;
	}

	public void setFareAmt(long fareAmt) {
		this.fareAmt = fareAmt;
	}

	public FlightBookingDetailsRequest getFltbooking() {
		return fltbooking;
	}

	public void setFltbooking(FlightBookingDetailsRequest fltbooking) {
		this.fltbooking = fltbooking;
	}

	
}

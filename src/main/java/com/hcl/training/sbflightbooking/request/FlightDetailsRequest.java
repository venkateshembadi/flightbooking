package com.hcl.training.sbflightbooking.request;


public class FlightDetailsRequest {
	
	private String airline;
	
	private String source;
	
	private String destination;
	
	private long seats;
	
	private Long date;
	
	private Long fareAmt;
	
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


	public Long getFareAmt() {
		return fareAmt;
	}

	public void setFareAmt(Long fareAmt) {
		this.fareAmt = fareAmt;
	}

	public FlightBookingDetailsRequest getFltbooking() {
		return fltbooking;
	}

	public void setFltbooking(FlightBookingDetailsRequest fltbooking) {
		this.fltbooking = fltbooking;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	
}

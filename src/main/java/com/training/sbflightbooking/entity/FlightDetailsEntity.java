package com.training.sbflightbooking.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flightdetails")
public class FlightDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fid;
	private String airline;
	private String source;
	private String destination;
	
	@Column(name = "availSeats")
	private long seats;
	
	private String bdate;
	
	@Column(name="pairamount")
	private long fareAmt;
	
	@OneToOne(mappedBy = "flightDetails")
	private FlightBookingDetails fltbooking;

	
	public Long getFid() {
		return fid;
	}

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

	
	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public long getFareAmt() {
		return fareAmt;
	}

	public void setFareAmt(long fareAmt) {
		this.fareAmt = fareAmt;
	}

	public FlightBookingDetails getFltbooking() {
		return fltbooking;
	}

	public void setFltbooking(FlightBookingDetails fltbooking) {
		this.fltbooking = fltbooking;
	}
	
}

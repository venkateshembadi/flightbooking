package com.training.sbflightbooking.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "flightbooking")
public class FlightBookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;

	private String mealstatus;

	@CreationTimestamp
	private Timestamp bookingDate;

	@OneToOne
	@JoinColumn(name = "fid")
	private FlightDetailsEntity flightDetails;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "uid")
	private UserDetails userDetails;

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

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

	public FlightDetailsEntity getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(FlightDetailsEntity flightDetails) {
		this.flightDetails = flightDetails;
	}

}

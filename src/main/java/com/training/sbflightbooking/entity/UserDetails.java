package com.training.sbflightbooking.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	private String uname;
	private String gender;

	@OneToMany(mappedBy = "userDetails", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<FlightBookingDetails> fltid;

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public List<FlightBookingDetails> getFltid() {
		return fltid;
	}

	public void setFltid(List<FlightBookingDetails> fltid) {
		this.fltid = fltid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

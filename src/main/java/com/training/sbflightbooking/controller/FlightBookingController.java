package com.training.sbflightbooking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.sbflightbooking.entity.FlightDetailsEntity;
import com.training.sbflightbooking.request.Flight;
import com.training.sbflightbooking.request.FlightDetailsRequest;
import com.training.sbflightbooking.service.FlightBookingServiceImpl;


@RestController
@RequestMapping("/flight")
public class FlightBookingController {
	
	@Autowired
	public FlightBookingServiceImpl flightService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveFlightBooking(@Valid @RequestBody FlightDetailsRequest request) {
		FlightDetailsRequest employee = flightService.saveFlightInfo(request);
		return ResponseEntity.ok().body(employee);
	}
	
	@PostMapping("/saveFlight")
	public ResponseEntity<?> saveFlight(@Valid @RequestBody FlightDetailsRequest request) {
		FlightDetailsRequest employee = flightService.saveFlight(request);
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/fetch")
	public ResponseEntity<?> searchFlight(@Valid @RequestBody Flight request) {
		FlightDetailsEntity employee = flightService.searchFlight(request.getSource(),request.getDestination(),request.getBookingDate());
		return ResponseEntity.ok().body(employee);
	}
	

}

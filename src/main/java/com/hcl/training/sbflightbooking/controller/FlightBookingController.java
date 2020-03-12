package com.hcl.training.sbflightbooking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.sbflightbooking.request.FlightDetailsRequest;
import com.hcl.training.sbflightbooking.service.FlightBookingServiceImpl;
;

@RestController
@RequestMapping("/employee")
public class FlightBookingController {
	
	@Autowired
	public FlightBookingServiceImpl flightService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@Valid @RequestBody FlightDetailsRequest request) {
		FlightDetailsRequest employee = flightService.saveFlightInfo(request);
		return ResponseEntity.ok().body(employee);
	}
	

}

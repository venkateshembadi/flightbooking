package com.hcl.training.sbflightbooking.service;

import com.hcl.training.sbflightbooking.request.FlightDetailsRequest;

public interface FlightBookingService {
	
	FlightDetailsRequest saveFlightInfo(FlightDetailsRequest flight);

}

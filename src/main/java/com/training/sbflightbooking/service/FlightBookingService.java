package com.training.sbflightbooking.service;

import com.training.sbflightbooking.entity.FlightDetailsEntity;
import com.training.sbflightbooking.request.FlightDetailsRequest;

public interface FlightBookingService {
	
	FlightDetailsRequest saveFlightInfo(FlightDetailsRequest flight);
	
	FlightDetailsRequest saveFlight(FlightDetailsRequest fdetails);
	
	FlightDetailsEntity searchFlight(String source,String destination,String bdate);

}

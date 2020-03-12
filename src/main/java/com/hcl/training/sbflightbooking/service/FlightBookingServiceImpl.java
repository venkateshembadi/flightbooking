package com.hcl.training.sbflightbooking.service;

import com.hcl.training.sbflightbooking.entity.FlightDetailsEntity;
import com.hcl.training.sbflightbooking.request.FlightDetailsRequest;

import io.micrometer.core.instrument.util.StringUtils;

public class FlightBookingServiceImpl implements FlightBookingService {

	@Override
	public FlightDetailsRequest saveFlightInfo(FlightDetailsRequest flight) {
		FlightDetailsRequest request=mapFlightData(flight);
		return request;
	}

	private FlightDetailsRequest mapFlightData(FlightDetailsRequest flight) {
		FlightDetailsEntity entity=null; 
		if(flight !=null) {
			entity=new FlightDetailsEntity();
			if(StringUtils.isNotBlank(flight.getSource()))
				entity.setSource(flight.getSource());
			if(StringUtils.isNotBlank(flight.getDestination()))
				entity.setDestination(flight.getDestination());
			if(StringUtils.isNotBlank(flight.getAirline()))
				entity.setAirline(flight.getAirline());
			if(flight.getDate() !=null) 
				entity.setDate(flight.getDate());	
			
		}
		return null;
	}

}

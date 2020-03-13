package com.training.sbflightbooking.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.sbflightbooking.entity.FlightBookingDetails;
import com.training.sbflightbooking.entity.FlightDetailsEntity;
import com.training.sbflightbooking.entity.UserDetails;
import com.training.sbflightbooking.repository.FlightDetailsRepository;
import com.training.sbflightbooking.repository.FlightRepository;
import com.training.sbflightbooking.request.FlightDetailsRequest;

import io.micrometer.core.instrument.util.StringUtils;

@Component
public class FlightBookingServiceImpl implements FlightBookingService {
	
	@Autowired
	public FlightDetailsRepository flightDao;
	
	@Autowired
	public FlightRepository fDAO;

	@Override
	public FlightDetailsRequest saveFlightInfo(FlightDetailsRequest flight) {
		FlightDetailsRequest request=mapFlightData(flight);
		return request;
	}

	private FlightDetailsRequest mapFlightData(FlightDetailsRequest flight) {
		//flightDao.findById(flight.getFId);
		FlightDetailsEntity entity=null; 
		FlightBookingDetails bookingEntity=null;
		UserDetails user=null;
		if(flight !=null) {
			entity=new FlightDetailsEntity();
			if(StringUtils.isNotBlank(flight.getSource()))
				entity.setSource(flight.getSource());
			if(StringUtils.isNotBlank(flight.getDestination()))
				entity.setDestination(flight.getDestination());
			if(StringUtils.isNotBlank(flight.getAirline()))
				entity.setAirline(flight.getAirline());
			if(flight.getFareAmt() !=null)
				entity.setFareAmt(flight.getFareAmt());
			bookingEntity=new FlightBookingDetails();
			bookingEntity.setFlightDetails(entity);
			if(flight.getFltbooking().getUserDetails() !=null) {
				user=new UserDetails();
				user.setGender(flight.getFltbooking().getUserDetails().getGender());
				user.setUid(flight.getFltbooking().getUserDetails().getUid());
				user.setUname(flight.getFltbooking().getUserDetails().getUname());
			}
			bookingEntity.setUserDetails(user);
			flightDao.save(entity);
		}
		return flight;
		
	}

	@Override
	public FlightDetailsRequest saveFlight(FlightDetailsRequest fdetails) {
		FlightDetailsEntity fentity=null;
		if(fdetails !=null) {
			fentity=new FlightDetailsEntity();
			
			fentity=new FlightDetailsEntity();
			if(StringUtils.isNotBlank(fdetails.getSource()))
				fentity.setSource(fdetails.getSource());
			if(StringUtils.isNotBlank(fdetails.getDestination()))
				fentity.setDestination(fdetails.getDestination());
			if(StringUtils.isNotBlank(fdetails.getAirline()))
				fentity.setAirline(fdetails.getAirline());
			if(fdetails.getSeats() !=null)
				fentity.setSeats(fdetails.getSeats());
			if(fdetails.getFareAmt() !=null)
				fentity.setFareAmt(fdetails.getFareAmt());
			if(fdetails.getBookingDate() !=null) {
				DateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		        Date result = new Date(fdetails.getBookingDate()); 
		        String date = simple.format(result); 
		        fentity.setBdate(date);
			}
			fDAO.save(fentity);
				
		}
		
		
		return fdetails;
	}

	@Override
	public FlightDetailsEntity searchFlight(String source, String destination, String bdate) {
		FlightDetailsEntity response=fDAO.findBySourceAndDestinationBdate(source,destination,bdate);
		return response;
	}
	
	

}

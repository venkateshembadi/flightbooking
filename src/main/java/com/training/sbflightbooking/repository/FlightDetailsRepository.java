package com.training.sbflightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.sbflightbooking.entity.FlightDetailsEntity;
import com.training.sbflightbooking.request.FlightDetailsRequest;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetailsEntity, Long> {

	
}

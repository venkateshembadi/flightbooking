package com.training.sbflightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.sbflightbooking.entity.FlightDetailsEntity;
import com.training.sbflightbooking.request.FlightDetailsRequest;

@Repository
public interface FlightRepository extends JpaRepository<FlightDetailsEntity, Long> {
	
	@Query("SELECT n FROM FlightDetailsEntity n WHERE n.source = ?1 AND n.destination = ?2 and n.bdate= ?3")
	FlightDetailsEntity findBySourceAndDestinationBdate(String source, String destination, String bdate);

}

package com.hcl.training.sbflightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.training.sbflightbooking.entity.FlightDetailsEntity;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetailsEntity, Long> {

}

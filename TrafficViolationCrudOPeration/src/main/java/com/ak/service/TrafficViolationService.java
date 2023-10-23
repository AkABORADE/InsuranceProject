package com.ak.service;

import java.util.List;

import com.ak.model.TrafficViolation;

public interface TrafficViolationService {

	//create 
	public TrafficViolation saveTrafficViolation(TrafficViolation trafficViolation); 
	//get
	public List<TrafficViolation> getAllTrafficViolations();
	
	public TrafficViolation getTraffTrafficViolationByID(Integer id);

	//update
	public TrafficViolation updateTrafficViolation(TrafficViolation trafficViolation, Integer id);
	//delete
	public String deleteTrafficViolationById(Integer id);
}

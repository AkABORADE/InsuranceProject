package com.ak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.model.TrafficViolation;
import com.ak.repos.TrafficViolationRepository;
import com.ak.service.TrafficViolationService;
@Service
public class TrafficViolationServiceImpl implements TrafficViolationService {
	
	@Autowired
	private TrafficViolationRepository trafficViolationRepository;
	
	@Override
	public TrafficViolation saveTrafficViolation(TrafficViolation trafficViolation) {
		
		return trafficViolationRepository.save(trafficViolation);
	}

	@Override
	public List<TrafficViolation> getAllTrafficViolations() {
		
		return trafficViolationRepository.findAll();
	}

	@Override
	public TrafficViolation getTraffTrafficViolationByID(Integer id) {
		
		return trafficViolationRepository.getById(id) ;
	}

	@SuppressWarnings("deprecation")
	@Override
	public TrafficViolation updateTrafficViolation(TrafficViolation trafficViolation, Integer id) {
		
		TrafficViolation trafficVioById = trafficViolationRepository.getById(id);
	 
		if(trafficVioById != null) {
			trafficVioById.setTrafficViolationCode(trafficViolation.getTrafficViolationCode());
			trafficVioById.setTrafficViolationQuestion(trafficViolation.getTrafficViolationQuestion());
			trafficVioById.setTraffiecViolationPoint(trafficViolation.getTraffiecViolationPoint());
			trafficVioById.setDescription(trafficViolation.getDescription());
		}
			trafficViolationRepository.save(trafficVioById);
			return trafficVioById;
	
	}

	@Override
	public String deleteTrafficViolationById(Integer id) {
		trafficViolationRepository.deleteById(id);
		
		return ("The Traffic violataion with " + id +" is deleted permanently"  );
	}

}

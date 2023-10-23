package com.ak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.model.Driver;
import com.ak.repos.DriverRepository;
import com.ak.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
	@Autowired
	private DriverRepository driverRepository;

	@Override
	public Driver saveDriverInfo(Driver driver) {

		return driverRepository.save(driver);
	}

	@Override
	public List<Driver> getAllDriversInfo() {

		return driverRepository.findAll();
	}

	@Override
	public Driver getDriverInfoById(Integer id) {
		return driverRepository.findById(id);
	}

	@Override
	public Driver updateDriverInfo(Integer id, Driver driver) {
		Driver driverFoundById = driverRepository.findById(id);

		if (driverFoundById != null) {
			driverFoundById.setFirstName(driver.getFirstName());
			driverFoundById.setdOB(driver.getdOB());
			driverFoundById.setLastName(driver.getLastName());
			driverFoundById.setEmailAddress(driver.getEmailAddress());
			driverFoundById.setMobileNumber(driver.getMobileNumber());
			driverFoundById.setPolicyId(driver.getPolicyId());
		}
		driverRepository.save(driverFoundById);
		return driverFoundById;
	}

	@Override
	public String deleteDriverInfoById(Integer Id) {
		driverRepository.deleteById(Id);
		return ("Driver with the id " + Id + "is deleted");
	}

}
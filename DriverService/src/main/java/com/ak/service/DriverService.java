package com.ak.service;

import java.util.List;



import com.ak.model.Driver;

public interface DriverService {
	//create
	public Driver saveDriverInfo(Driver driver);
	//get
	public List<Driver> getAllDriversInfo();
	public Driver getDriverInfoById(Integer id);
	//update
	public Driver updateDriverInfo(Integer id, Driver driver );
	//delete
	public String deleteDriverInfoById(Integer Id); 
	
}

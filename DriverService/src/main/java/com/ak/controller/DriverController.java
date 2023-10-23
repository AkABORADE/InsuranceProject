package com.ak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.model.Driver;
import com.ak.service.DriverService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@RequestMapping("/drivers")
@JsonIgnoreProperties({"hibernateLazyInitilizer","handler"})
public class DriverController {
	@Autowired
	private DriverService driverService;

	// create
	@PostMapping
	public ResponseEntity<Driver> saveDriverInfo(@RequestBody Driver driver) {

		return ResponseEntity.status(HttpStatus.CREATED).body(driverService.saveDriverInfo(driver));
	}

	// get
	@GetMapping
	public ResponseEntity<List<Driver>> getAllDriversInfo() {
		return ResponseEntity.ok(driverService.getAllDriversInfo());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Driver> getDriverInfoById(@PathVariable Integer id) {
		return ResponseEntity.ok(driverService.getDriverInfoById(id));
	}

	// update
	@PutMapping("/{id}")
	public ResponseEntity<Driver> updateDriverInfo(@PathVariable Integer id, @RequestBody Driver driver) {

		return ResponseEntity.status(HttpStatus.CREATED).body(driverService.updateDriverInfo(id, driver));

	}

	// delete
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDriverInfoById(@PathVariable Integer id) {
		return ResponseEntity.ok(driverService.deleteDriverInfoById(id));

	}

}

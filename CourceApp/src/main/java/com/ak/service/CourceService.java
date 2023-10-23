package com.ak.service;

import java.util.List;

import com.ak.model.Cource;

public interface CourceService {
	//Create
	public Cource saveCource(Cource cource);
	//update
	public Cource updateCource(Cource cource,Integer courceId);
	//delete
	public void deleteCourceById(Integer courceId);
	//get all cource
	public List<Cource> getAllCources(); 
	//get specific cource
	public Cource getCourceById(Integer courceId);
}

package com.ak.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.model.Cource;
import com.ak.repository.CourceRepository;
import com.ak.service.CourceService;

@Service
public class CourceServoiceImpl implements CourceService {
	@Autowired
	private CourceRepository courceRepository;

	@Override
	public Cource saveCource(Cource cource) {

		return courceRepository.save(cource);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Cource updateCource(Cource cource, Integer courceId) {
		
		  Cource courceById = courceRepository.getById(courceId);
		
		if(courceById != null) {
			courceById.setAuthor(cource.getAuthor());
			courceById.setCourceName(cource.getCourceName());
		}
	courceRepository.save(courceById);	
	return courceById;
	}

	@Override
	public void deleteCourceById(Integer courceId) {

		courceRepository.deleteById(courceId);
	}

	@Override
	public List<Cource> getAllCources() {

		return courceRepository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Cource getCourceById(Integer Id) {

		return courceRepository.getById(Id);
	}

}

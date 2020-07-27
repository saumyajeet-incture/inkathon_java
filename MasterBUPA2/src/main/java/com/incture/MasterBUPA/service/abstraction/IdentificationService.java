package com.incture.MasterBUPA.service.abstraction;

import java.util.List;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.Identification;


@Service
public interface IdentificationService {
	public void save(Identification identification);
	
	public List<Identification> findIdentification();
	
	public Identification findIdentificationById(int id);
}

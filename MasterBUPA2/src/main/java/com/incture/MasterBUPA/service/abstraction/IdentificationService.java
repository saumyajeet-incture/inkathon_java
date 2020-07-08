package com.incture.MasterBUPA.service.abstraction;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.Identification;


@Service
public interface IdentificationService {
	public void save(Identification identification);
}

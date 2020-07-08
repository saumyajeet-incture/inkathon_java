/**
 * 
 */
package com.incture.MasterBUPA.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.IdentificationRepository;
import com.incture.MasterBUPA.entity.Identification;
import com.incture.MasterBUPA.service.abstraction.IdentificationService;

/**
 * @author ASHU
 * @author SAUMYAJEET
 *
 */
@Service
public class IdentificationServiceImplementation implements IdentificationService {
	
	@Autowired
	private IdentificationRepository identificationRepository;

	@Override
	public void save(Identification identification) {
		// TODO Auto-generated method stub
		identificationRepository.save(identification);
		
	}

}

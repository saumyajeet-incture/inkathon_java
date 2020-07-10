package com.incture.MasterBUPA.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.BUPARepository;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.service.abstraction.BUPAService;

/**
 * @author SAUMYAJEET
 *
 */

@Service
public class BupaServiceImplementation implements BUPAService {
	
	@Autowired
	private BUPARepository bupaRepository;

	@Override
	public BusinessPartner save(BusinessPartner businessPartner) {
		// TODO Auto-generated method stub
		return bupaRepository.save(businessPartner);
	}
	


}

package com.incture.MasterBUPA.service.abstraction;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.BusinessPartner;

/**
 * @author SAUMYAJEET
 *
 */

@Service
public interface BUPAService {
	
	public void save(BusinessPartner businessPartner);

}
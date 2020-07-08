package com.incture.MasterBUPA.service.abstraction;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.Address;


/**
 * @author SAUMYAJEET
 *
 */

@Service
public interface AddressService {
	
	public void save(Address address);

}

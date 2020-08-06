package com.incture.MasterBUPA.service.abstraction;

import java.util.List;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.Address;


/**
 * @author SAUMYAJEET
 *
 */

@Service
public interface AddressService {
	
	public void save(Address address);
	
	public List<Address> getAllAddress();
	
	public List<Address> getAddressById(int id);

}

/**
 * 
 */
package com.incture.MasterBUPA.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.AddressRepository;
import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.service.abstraction.AddressService;

/**
 * @author ASHU
 * @author SAUMYAJEET
 *
 */
@Service
public class AddressServiceImplementation implements AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void save(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
	}

}

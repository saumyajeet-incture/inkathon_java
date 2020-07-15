package com.incture.BusinessPartner.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.incture.BusinessPartner.dao.AddressDAO;
import com.incture.BusinessPartner.entity.Address;

public class AddressServiceImplementation implements AddressService {
	
	@Autowired
	private AddressDAO addressDAO;

	@Override
	public void save(Address address) {
		// TODO Auto-generated method stub
		addressDAO.save(address);
	}

}

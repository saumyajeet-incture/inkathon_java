/**
 * 
 */
package com.incture.MasterBUPA.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public List<Object[]> checkIfExists = null;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void save(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
	}

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	@Override
	public List<Address> getAddressById(int id) {
		// TODO Auto-generated method stub
		checkIfExists = addressRepository.findDetail(id);
		int status = 0;
		if (checkIfExists.isEmpty()) {
			status = 1;
		}
		List<Address> listAddress = new ArrayList<>();
		Address address;

		if (status == 1) {
			return null;
		}

		for (int i = 0; i < checkIfExists.size(); i++) {
			address = new Address();
			address.setAddressId((Integer) checkIfExists.get(i)[0]);
			address.setBpId((Integer) checkIfExists.get(i)[1]);
			address.setCity((String) checkIfExists.get(i)[2]);
			address.setCountry((String) checkIfExists.get(i)[3]);
			address.setEmail((String) checkIfExists.get(i)[4]);
			address.setPostalCode((String) checkIfExists.get(i)[5]);
			address.setStreet1((String) checkIfExists.get(i)[6]);
			address.setStreet2((String) checkIfExists.get(i)[7]);
			address.setStreet4((String) checkIfExists.get(i)[8]);
			address.setTelephone((String) checkIfExists.get(i)[9]);
			listAddress.add(address);

		}

		return listAddress;
	}

}

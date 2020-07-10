package com.incture.MasterBUPA.mapper;

import java.util.ArrayList;
import java.util.List;

import com.incture.MasterBUPA.dto.request.AddressDTO;
import com.incture.MasterBUPA.entity.Address;

public class AddressMapper {

	public static List<Address> checkAddress(List<AddressDTO> addressDTO, Integer bp_id) {

		List<Address> listAddress = new ArrayList<>();
		
		for (AddressDTO addressDto : addressDTO) {
			// bp_id=businessPartner.getBpId();
			if (addressDto.getCity() != "" && addressDto.getCountry() != "" && addressDto.getEmail() != ""
					&& addressDto.getPostalCode() != "" && addressDto.getStreet() != "" && addressDto.getStreet2() != ""
					&& addressDto.getStreet4() != "" && addressDto.getTelephone() != "") {
				Address address = new Address();
				address.setBpId(bp_id);
				address.setCity(addressDto.getCity());
				address.setCountry(addressDto.getCountry());
				address.setEmail(addressDto.getEmail());
				address.setPostalCode(addressDto.getPostalCode());
				address.setStreet1(addressDto.getStreet());
				address.setStreet2(addressDto.getStreet2());
				address.setStreet4(addressDto.getStreet4());
				address.setTelephone(addressDto.getTelephone());
				listAddress.add(address);
				
			}
		}
		return listAddress;

	}
}

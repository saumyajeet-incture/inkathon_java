package com.incture.MasterBUPA.service.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.request.AddressDTO;
import com.incture.MasterBUPA.dto.request.BupaDTO;
import com.incture.MasterBUPA.dto.request.CommunicationDTO;
import com.incture.MasterBUPA.dto.request.IdentificationDTO;
import com.incture.MasterBUPA.dto.request.PaymentDTO;
import com.incture.MasterBUPA.dto.request.SaveBupa;
import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.service.abstraction.BUPAService;
import com.incture.MasterBUPA.service.abstraction.MainBupaService;

@Service
public class MainBupaServiceImplementation implements MainBupaService {
	
	
	private BusinessPartner businessPartner=new BusinessPartner();
	private Address address=new Address();
	
	@Autowired
	private BUPAService bupaService;

	@Override
	public void save(SaveBupa saveBupa) {
		// TODO Auto-generated method stub
		List<AddressDTO>  addressDTO=saveBupa.getAddress();
		
		BupaDTO bupaDTO=saveBupa.getBasicDetails();
		
		CommunicationDTO communicationDTO=saveBupa.getCommunications();
		IdentificationDTO identificationDTO=saveBupa.getIdentifications();
		List<PaymentDTO> paymentDTO=saveBupa.getPayment();
		
		businessPartner.setBpRole(bupaDTO.getsRole());
		businessPartner.setRoleId(UUID.randomUUID());
		businessPartner.setFirstName(bupaDTO.getFname());
		businessPartner.setLangKey(bupaDTO.getsLanguage());
		businessPartner.setLastName(bupaDTO.getLname());
		businessPartner.setSearchTerm1(bupaDTO.getsTerm1());
		businessPartner.setSearchTerm2(bupaDTO.getsTerm2());
		
		bupaService.save(businessPartner);
		
		address.setBpId(businessPartner.getBpId());
//		System.out.println("BP Id" +address.getBpId());
		
		

	}

}

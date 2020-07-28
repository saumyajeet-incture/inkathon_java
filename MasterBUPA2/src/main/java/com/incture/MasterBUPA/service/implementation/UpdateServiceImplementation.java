package com.incture.MasterBUPA.service.implementation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.AddressRepository;
import com.incture.MasterBUPA.dao.bupa.BUPARepository;
import com.incture.MasterBUPA.dao.bupa.CommunicationRepository;
import com.incture.MasterBUPA.dao.bupa.IdentificationRepository;
import com.incture.MasterBUPA.dao.bupa.PaymentRepository;
import com.incture.MasterBUPA.dto.request.AddressDTO;
import com.incture.MasterBUPA.dto.request.BupaDTO;
import com.incture.MasterBUPA.dto.request.CommunicationDTO;
import com.incture.MasterBUPA.dto.request.IdentificationDTO;
import com.incture.MasterBUPA.dto.request.PaymentDTO;
import com.incture.MasterBUPA.dto.request.UpdateDTO;
import com.incture.MasterBUPA.dto.response.IdDto;
import com.incture.MasterBUPA.service.abstraction.UpdateService;

@Service
public class UpdateServiceImplementation implements UpdateService{
	
	@Autowired
	private BUPARepository bupaRepo;
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private CommunicationRepository communicationRepo;
	
	@Autowired
	private IdentificationRepository identificationRepo;
	
	@Autowired
	private PaymentRepository paymentRepo;

	@Override
	public IdDto update(UpdateDTO updateDTO) {
		// TODO Auto-generated method stub
		
		int id=updateDTO.getBpId();
		BupaDTO basicDetails=updateDTO.getBasicDetails();
		Set<AddressDTO> listAddress=updateDTO.getAddress();
		CommunicationDTO communications=updateDTO.getCommunications();
		IdentificationDTO identifications=updateDTO.getIdentifications();
		Set<PaymentDTO> listPayment=updateDTO.getPayment();
		
		BupaDTO bupaEntity=new BupaDTO();
		List<Object[]> listBasicDetail=bupaRepo.getBasicDetails(id);
		bupaEntity.setFname((String) listBasicDetail.get(0)[1]);
		bupaEntity.setLname((String) listBasicDetail.get(0)[3]);
		bupaEntity.setsLanguage((String) listBasicDetail.get(0)[2]);
		bupaEntity.setsTerm1((String) listBasicDetail.get(0)[4]);
		bupaEntity.setsTerm2((String) listBasicDetail.get(0)[5]);
		bupaEntity.setsRole((String) listBasicDetail.get(0)[0]);
		
//		Set<Object[]> listAddressDetail=addressRepo.getAddressDetail(id);
//		System.out.println(listAddress.toString());
//		System.out.println(listAddressDetail.contains(listAddress));
//		
//		int status=0;
		if(bupaEntity.toString().equals(basicDetails.toString())){
			//status=1;
			System.out.println("basic data matched");
	}
		return null;
		
		
	}

}

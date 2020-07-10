package com.incture.MasterBUPA.service.implementation;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.incture.MasterBUPA.dto.request.AddressDTO;
import com.incture.MasterBUPA.dto.request.BupaDTO;
import com.incture.MasterBUPA.dto.request.CommunicationDTO;
import com.incture.MasterBUPA.dto.request.IdentificationDTO;
import com.incture.MasterBUPA.dto.request.PaymentDTO;
import com.incture.MasterBUPA.dto.request.SaveBupa;
import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.entity.CommunicationDetail;
import com.incture.MasterBUPA.entity.Identification;
import com.incture.MasterBUPA.entity.PaymentTransactions;
import com.incture.MasterBUPA.mapper.AddressMapper;
import com.incture.MasterBUPA.mapper.BupaMapper;
import com.incture.MasterBUPA.mapper.CommunicationMapper;
import com.incture.MasterBUPA.mapper.IdentificationMapper;
import com.incture.MasterBUPA.mapper.PaymentMapper;
import com.incture.MasterBUPA.service.abstraction.AddressService;
import com.incture.MasterBUPA.service.abstraction.BUPAService;
import com.incture.MasterBUPA.service.abstraction.CommunicationService;
import com.incture.MasterBUPA.service.abstraction.IdentificationService;
import com.incture.MasterBUPA.service.abstraction.MainBupaService;
import com.incture.MasterBUPA.service.abstraction.PaymentTransactionService;

/**
 * @author ASHU
 * @author SOUMYAJEET 
<<<<<<< HEAD
 * remove it after seeing
=======
 * Mapping the DTO Services to MODEL services
>>>>>>> branch 'new' of https://github.com/saumyajeet-incture/inkathon_java.git
 */
@Service
@Transactional
public class MainBupaServiceImplementation implements MainBupaService {

//	private BusinessPartner businessPartner = new BusinessPartner();
//	private Address address = new Address();
//	private CommunicationDetail communication = new CommunicationDetail();
//	private PaymentTransactions payment = new PaymentTransactions();
//	private Identification identity = new Identification();
	
	public Integer bp_id;

	/**
	 * @return the bp_id
	 */
	public Integer getBp_id() {
		return bp_id;
	}

	/**
	 * @param bp_id the bp_id to set
	 */
	public void setBp_id(Integer bp_id) {
		this.bp_id = bp_id;
	}

	@Autowired
	private BUPAService bupaService;

	@Autowired
	AddressService addressService;

	@Autowired
	CommunicationService communicationService;

	@Autowired
	IdentificationService identificationService;

	@Autowired
	PaymentTransactionService paymentTransactionService;

	@Override
	public Integer save(SaveBupa saveBupa) {
		
		List<AddressDTO> addressDTO = saveBupa.getAddress();
		BupaDTO bupaDTO = saveBupa.getBasicDetails();
		CommunicationDTO communicationDTO = saveBupa.getCommunications();
		IdentificationDTO identificationDTO = saveBupa.getIdentifications();
		List<PaymentDTO> paymentDTO = saveBupa.getPayment();

		BusinessPartner businessPartner=new BusinessPartner();
		businessPartner.setBpId(0);
		
		businessPartner = bupaService.save(BupaMapper.checkBP(bupaDTO));
		
		
		bp_id=businessPartner.getBpId();
		System.out.println("business partner id"+ bp_id);

		// ADDRESS DTO MAPPING
		
		List<Address> address=AddressMapper.checkAddress(addressDTO, bp_id);
		for(Address address2:address){
			addressService.save(address2);
		}
		

		// COMMUNICATION DETAILS DTO MAPPING
		
		communicationService.save(CommunicationMapper.checkCommunication(communicationDTO, bp_id));

		identificationService.save(IdentificationMapper.checkIdentification(identificationDTO, bp_id));

		// payment DTO mapping
		List<PaymentTransactions> paymentList=PaymentMapper.checkPayment(paymentDTO, bp_id);
		for(PaymentTransactions pt:paymentList){
			paymentTransactionService.save(pt);
		}
		
		return bp_id;

	}

}

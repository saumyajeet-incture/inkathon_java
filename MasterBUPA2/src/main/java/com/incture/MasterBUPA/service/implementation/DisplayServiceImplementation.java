package com.incture.MasterBUPA.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.response.DisplayResponse;
import com.incture.MasterBUPA.service.abstraction.AddressService;
import com.incture.MasterBUPA.service.abstraction.BUPAService;
import com.incture.MasterBUPA.service.abstraction.CommunicationService;
import com.incture.MasterBUPA.service.abstraction.DisplayService;
import com.incture.MasterBUPA.service.abstraction.IdentificationService;
import com.incture.MasterBUPA.service.abstraction.PaymentTransactionService;

@Service
public class DisplayServiceImplementation implements DisplayService {
	
	
	public DisplayResponse displayResponse;
	
	@Autowired
	private BUPAService bupaService;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private CommunicationService commService;
	
	@Autowired
	private IdentificationService identificationService;
	
	@Autowired
	private PaymentTransactionService paymentService;
	

	@Override
	public DisplayResponse findEachData(int bpId) {
		// TODO Auto-generated method stub
		//List<Address> listAddress=new ArrayList<>();
		displayResponse=new DisplayResponse();
		displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
		displayResponse.setAddress(addressService.getAddressById(bpId));
		displayResponse.setCommDetail(commService.getCommunicationById(bpId));
		displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
		displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
		return displayResponse;
	}

}
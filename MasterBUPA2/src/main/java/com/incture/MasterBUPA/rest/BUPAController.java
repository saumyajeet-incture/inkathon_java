package com.incture.MasterBUPA.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.MasterBUPA.dto.request.SaveBupa;
import com.incture.MasterBUPA.dto.response.IdDto;
import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.entity.CommunicationDetail;
import com.incture.MasterBUPA.entity.Identification;
import com.incture.MasterBUPA.entity.PaymentTransactions;
import com.incture.MasterBUPA.service.abstraction.AddressService;
import com.incture.MasterBUPA.service.abstraction.BUPAService;
import com.incture.MasterBUPA.service.abstraction.CommunicationService;
import com.incture.MasterBUPA.service.abstraction.IdentificationService;
import com.incture.MasterBUPA.service.abstraction.MainBupaService;
import com.incture.MasterBUPA.service.abstraction.PaymentTransactionService;

@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
@RequestMapping("/bpc")
public class BUPAController {
	
	@Autowired
	private BUPAService bupaService;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private CommunicationService communicationService;
	
	@Autowired
	private IdentificationService identificationService;
	
	@Autowired
	private PaymentTransactionService paymentService;
	
	@Autowired
	private MainBupaService mainBupaService;
	
	@PostMapping("/bupa")
	public BusinessPartner addBusinessPartner(@RequestBody BusinessPartner businessPartner){
		
		bupaService.save(businessPartner);
		return businessPartner;
	}
	
	@PostMapping("/saveBupa")
	public IdDto saveBupa(@RequestBody SaveBupa savebupa){
		IdDto bpId= mainBupaService.save(savebupa);
		
		
		return bpId;
	}
	
	@PostMapping("/address")
	public Address addAddress(@RequestBody Address address){
		addressService.save(address);
		return address;
	}
	
	@PostMapping("/communication")
	public CommunicationDetail addCommunicationDetail(@RequestBody CommunicationDetail communicationDetail){
		communicationService.save(communicationDetail);
		return communicationDetail;
	}
	
	@PostMapping("/identification")
	public Identification addIdentification(@RequestBody Identification identification){
		identificationService.save(identification);
		return identification;
	}
	
	@PostMapping("/payment")
	public PaymentTransactions addPaymentTransactions(@RequestBody PaymentTransactions paymentTransactions){
		paymentService.save(paymentTransactions);
		return paymentTransactions;
	}

}

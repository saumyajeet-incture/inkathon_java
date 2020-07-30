package com.incture.MasterBUPA.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.response.DisplayResponse;
import com.incture.MasterBUPA.entity.BusinessPartner;
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
		if(bupaService.findByBpId(bpId)==null){
			displayResponse.setStatus(false);
			return displayResponse;
		}
			
		displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
		displayResponse.setAddress(addressService.getAddressById(bpId));
		displayResponse.setCommDetail(commService.getCommunicationById(bpId));
		displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
		displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
		displayResponse.setStatus(true);
		return displayResponse;
	}


	@Override
	public DisplayResponse findEachDatabyRoleId(int roleId) {
		// TODO Auto-generated method stub
		BusinessPartner businessPartner=bupaService.findByRoleId(roleId);
		displayResponse=new DisplayResponse();
		if(businessPartner==null){
			displayResponse.setStatus(false);
			return displayResponse;
		}
		int bpId=businessPartner.getBpId();
		
		displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
		displayResponse.setAddress(addressService.getAddressById(bpId));
		displayResponse.setCommDetail(commService.getCommunicationById(bpId));
		displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
		displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
		displayResponse.setStatus(true);
		return displayResponse;
	}


	@Override
	public List<DisplayResponse> findEachDatabyFirstName(String firstName) {
		// TODO Auto-generated method stub
		
		List<Object[]> listObject=bupaService.findByFirstName(firstName);
		
		List<DisplayResponse> listDisplay=new ArrayList<>();
		
		if(listObject.isEmpty()){
			DisplayResponse displayResponse=new DisplayResponse();
			displayResponse.setStatus(false);
			listDisplay.add(displayResponse);
			return listDisplay;
		}
		
		DisplayResponse displayResponse;
		
		for(int i=0;i<listObject.size();i++){
			displayResponse=new DisplayResponse();
			int bpId=(int) listObject.get(i)[5];
			
			displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
			displayResponse.setAddress(addressService.getAddressById(bpId));
			displayResponse.setCommDetail(commService.getCommunicationById(bpId));
			displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
			displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
			displayResponse.setStatus(true);
			listDisplay.add(displayResponse);
			
		}
		
		
		
		return listDisplay;
	}


	@Override
	public List<DisplayResponse> findEachDatabyLastName(String lastName) {
		// TODO Auto-generated method stub
		List<Object[]> listObject=bupaService.findByLastName(lastName);
		
		List<DisplayResponse> listDisplay=new ArrayList<>();
		
		if(listObject.isEmpty()){
			DisplayResponse displayResponse=new DisplayResponse();
			displayResponse.setStatus(false);
			listDisplay.add(displayResponse);
			return listDisplay;
		}
		
		DisplayResponse displayResponse;
		
		for(int i=0;i<listObject.size();i++){
			displayResponse=new DisplayResponse();
			int bpId=(int) listObject.get(i)[5];
			
			displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
			displayResponse.setAddress(addressService.getAddressById(bpId));
			displayResponse.setCommDetail(commService.getCommunicationById(bpId));
			displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
			displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
			displayResponse.setStatus(true);
			listDisplay.add(displayResponse);
			
		}
		
		return listDisplay;
	}


	@Override
	public List<DisplayResponse> findEachDatabyRole(String role) {
		// TODO Auto-generated method stub
		List<Object[]> listObject=bupaService.findByRole(role);
		
		List<DisplayResponse> listDisplay=new ArrayList<>();
		
		if(listObject.isEmpty()){
			DisplayResponse displayResponse=new DisplayResponse();
			displayResponse.setStatus(false);
			listDisplay.add(displayResponse);
			return listDisplay;
		}
		
		DisplayResponse displayResponse;
		
		for(int i=0;i<listObject.size();i++){
			displayResponse=new DisplayResponse();
			int bpId=(int) listObject.get(i)[5];
			
			displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
			displayResponse.setAddress(addressService.getAddressById(bpId));
			displayResponse.setCommDetail(commService.getCommunicationById(bpId));
			displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
			displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
			displayResponse.setStatus(true);
			listDisplay.add(displayResponse);
			
		}
		
		return listDisplay;
	}

}
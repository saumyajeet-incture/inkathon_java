package com.incture.MasterBUPA.service.implementation;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.BUPARepository;
import com.incture.MasterBUPA.dto.request.AddressDTO;
import com.incture.MasterBUPA.dto.request.BupaDTO;
import com.incture.MasterBUPA.dto.request.CommunicationDTO;
import com.incture.MasterBUPA.dto.request.IdentificationDTO;
import com.incture.MasterBUPA.dto.request.PaymentDTO;
import com.incture.MasterBUPA.dto.response.DisplayResponse;
import com.incture.MasterBUPA.dto.response.PageResponse;
import com.incture.MasterBUPA.dto.response.SaveBupaResponse;
import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.entity.CommunicationDetail;
import com.incture.MasterBUPA.entity.Identification;
import com.incture.MasterBUPA.entity.PaymentTransactions;
import com.incture.MasterBUPA.service.abstraction.AddressService;
import com.incture.MasterBUPA.service.abstraction.BUPAService;
import com.incture.MasterBUPA.service.abstraction.CommunicationService;
import com.incture.MasterBUPA.service.abstraction.DisplayService;
import com.incture.MasterBUPA.service.abstraction.IdentificationService;
import com.incture.MasterBUPA.service.abstraction.PaymentTransactionService;

@Service
public class DisplayServiceImplementation implements DisplayService {
	
	
	public SaveBupaResponse saveBupaResponse;
	
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
	public SaveBupaResponse findEachData(int bpId) {
		// TODO Auto-generated method stub
		//List<Address> listAddress=new ArrayList<>();
		
		BupaDTO basicDetails=new BupaDTO();
		List<AddressDTO> address=new ArrayList<>();;
		CommunicationDTO communications;
		IdentificationDTO identifications;
		List<PaymentDTO> payment=new ArrayList<>();
		saveBupaResponse=new SaveBupaResponse();
		
		
		
		//=====BASIC DETAILS MAPPING=======
		if(bupaService.findByBpId(bpId)==null){
			saveBupaResponse.setStatus(false);
			return saveBupaResponse;
		}
		
		saveBupaResponse.setStatus(true);
		BusinessPartner businessPartner=new BusinessPartner();
		businessPartner=bupaService.findByBpId(bpId);
		basicDetails.setFname(businessPartner.getFirstName());
		basicDetails.setLname(businessPartner.getLastName());
		basicDetails.setsLanguage(businessPartner.getLangKey());
		basicDetails.setsRole(businessPartner.getBpRole());
		basicDetails.setsTerm1(businessPartner.getSearchTerm1());
		basicDetails.setsTerm2(businessPartner.getSearchTerm2());
		
		saveBupaResponse.setBasicDetails(basicDetails);
		
		
		//=============ADDRESS MAPPING===========
		
		int addressLength = 0;

		Address addressEntity;
		AddressDTO addressDto;
		try {
			addressLength = addressService.getAddressById(bpId).size();
		} catch (Exception e) {
			// TODO Auto-generated catch block

			saveBupaResponse.setAddress(null);
		}

		List<Address> listAddress = addressService.getAddressById(bpId);

		if (addressLength != 0) {
			for (int i = 0; i < addressLength; i++) {
				addressEntity = new Address();
				addressDto = new AddressDTO();
				addressEntity = listAddress.get(i);
				addressDto.setCity(addressEntity.getCity());
				addressDto.setCountry(addressEntity.getCountry());
				addressDto.setEmail(addressEntity.getEmail());
				addressDto.setPostalCode(addressEntity.getPostalCode());
				addressDto.setStreet(addressEntity.getStreet1());
				addressDto.setStreet2(addressEntity.getStreet2());
				addressDto.setStreet4(addressEntity.getStreet4());
				addressDto.setTelephone(addressEntity.getTelephone());
				address.add(addressDto);
			}
			saveBupaResponse.setAddress(address);
		}

		// ===============COMMUNICATION DETAIL MAPPING==========

		CommunicationDetail communicationDetail = commService.getCommunicationById(bpId);
		communications = new CommunicationDTO();
		if (communicationDetail != null) {
			communications.setComments(communicationDetail.getComments());
			communications.setEmail(communicationDetail.getEmail());
			communications.setExtAddress(communicationDetail.getExtAddress());
			communications.setFax(communicationDetail.getFax());
			communications.setMobile(communicationDetail.getMobile());
			communications.setStandCommMethod(communicationDetail.getStandCommMethod());
			communications.setTelephone(communicationDetail.getTelephone());
			saveBupaResponse.setCommunications(communications);
		} else {
			saveBupaResponse.setCommunications(null);
		}

		// ===============IDENTIFICATION MAPPING============

		Identification identificationDO = identificationService.findIdentificationById(bpId);
		identifications = new IdentificationDTO();
		if (identificationDO != null) {
			identifications.setBirthPlace(identificationDO.getBirthPlace());
			identifications.setCountry(identificationDO.getCitizenship());
			identifications.setCountryOfOrigin(identificationDO.getCountryOfOrigin());
			identifications.setEmployer(identificationDO.getEmployeer());
			identifications.setMaritalStatus(identificationDO.getMaritalStatus());
			identifications.setNationality(identificationDO.getNationalityStatus());
			identifications.setOccupation(identificationDO.getOccupation());
			identifications.setPersonnelNo(identificationDO.getPersonnelNo());
			identifications.setUname(identificationDO.getUserName());
			saveBupaResponse.setIdentifications(identifications);
		} else {
			saveBupaResponse.setIdentifications(null);
		}

		// ===============PAYMENT TRANSACTION MAPPING==========

		int paymentsLength = 0;
		try {
			paymentsLength = paymentService.findPaymentTransactionsById(bpId).size();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			saveBupaResponse.setPayment(null);
		}
		PaymentTransactions paymentEntity;
		PaymentDTO paymentDto;
		List<PaymentTransactions> listPayment = paymentService.findPaymentTransactionsById(bpId);

		if (paymentsLength != 0) {
			for (int i = 0; i < paymentsLength; i++) {
				paymentEntity = new PaymentTransactions();
				paymentDto = new PaymentDTO();
				paymentEntity = listPayment.get(i);
				paymentDto.setBankAcct(paymentEntity.getBankAccount());
				paymentDto.setBankKey(paymentEntity.getBankKey());
				paymentDto.setControlKey(paymentEntity.getControlKey());
				paymentDto.setIban(paymentEntity.getiBAN());
				paymentDto.setId(paymentEntity.getTransactionID());
				paymentDto.setpCity(paymentEntity.getPaymentCity());
				paymentDto.setRefDoc(paymentEntity.getReferenceDocument());
				payment.add(paymentDto);
			}

			saveBupaResponse.setPayment(payment);
		}

		return saveBupaResponse;

	}

	@Override
	public PageResponse findEachDatabyRoleId(int roleId) {
		// TODO Auto-generated method stub
		List<BusinessPartner> listBusinessPartner=new ArrayList<>();
     	BusinessPartner businessPartner=bupaService.findByRoleId(roleId);
     	PageResponse pageResponse=new PageResponse();
		if(businessPartner==null){
			pageResponse.setTotalPage(0);;
			return pageResponse;
		}
		listBusinessPartner.add(businessPartner);
		pageResponse.setListBusinessPartner(listBusinessPartner);
		pageResponse.setTotalPage(1);
		return pageResponse;
	}
//	}

	@Override
	public PageResponse findDataByBpId(int bpId) {
		// TODO Auto-generated method stub
		List<BusinessPartner> listBusinessPartner=new ArrayList<>();
		BusinessPartner businessPartner=new BusinessPartner();
		PageResponse pageResponse=new PageResponse();
		businessPartner=bupaService.findByBpId(bpId);
		if(businessPartner==null){
			pageResponse.setListBusinessPartner(null);
			pageResponse.setTotalPage(0);
			return pageResponse;
		}
		listBusinessPartner.add(businessPartner);
		pageResponse.setListBusinessPartner(listBusinessPartner);
		pageResponse.setTotalPage(1);
		return pageResponse;
	}


//	@Override
//	public List<DisplayResponse> findEachDatabyFirstName(String firstName) {
//		// TODO Auto-generated method stub
//		
//		List<Object[]> listObject=bupaService.findByFirstName(firstName);
//		
//		List<DisplayResponse> listDisplay=new ArrayList<>();
//		
//		if(listObject.isEmpty()){
//			DisplayResponse displayResponse=new DisplayResponse();
//			displayResponse.setStatus(false);
//			listDisplay.add(displayResponse);
//			return listDisplay;
//		}
//		
//		DisplayResponse displayResponse;
//		
//		for(int i=0;i<listObject.size();i++){
//			displayResponse=new DisplayResponse();
//			int bpId=(int) listObject.get(i)[5];
//			
//			displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
//			displayResponse.setAddress(addressService.getAddressById(bpId));
//			displayResponse.setCommDetail(commService.getCommunicationById(bpId));
//			displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
//			displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
//			displayResponse.setStatus(true);
//			listDisplay.add(displayResponse);
//			
//		}
//		
//		
//		
//		return listDisplay;
//	}
//
//
//	@Override
//	public List<DisplayResponse> findEachDatabyLastName(String lastName) {
//		// TODO Auto-generated method stub
//		List<Object[]> listObject=bupaService.findByLastName(lastName);
//		
//		List<DisplayResponse> listDisplay=new ArrayList<>();
//		
//		if(listObject.isEmpty()){
//			DisplayResponse displayResponse=new DisplayResponse();
//			displayResponse.setStatus(false);
//			listDisplay.add(displayResponse);
//			return listDisplay;
//		}
//		
//		DisplayResponse displayResponse;
//		
//		for(int i=0;i<listObject.size();i++){
//			displayResponse=new DisplayResponse();
//			int bpId=(int) listObject.get(i)[5];
//			
//			displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
//			displayResponse.setAddress(addressService.getAddressById(bpId));
//			displayResponse.setCommDetail(commService.getCommunicationById(bpId));
//			displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
//			displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
//			displayResponse.setStatus(true);
//			listDisplay.add(displayResponse);
//			
//		}
//		
//		return listDisplay;
//	}
//
////
//	@Override
//	public List<DisplayResponse> findEachDatabyRole(String role) {
//		// TODO Auto-generated method stub
//		List<Object[]> listObject=bupaService.findByRole(role);
//		
//		List<DisplayResponse> listDisplay=new ArrayList<>();
//		
//		if(listObject.isEmpty()){
//			DisplayResponse displayResponse=new DisplayResponse();
//			displayResponse.setStatus(false);
//			listDisplay.add(displayResponse);
//			return listDisplay;
//		}
//		
//		DisplayResponse displayResponse;
//		
//		for(int i=0;i<listObject.size();i++){
//			displayResponse=new DisplayResponse();
//			int bpId=(int) listObject.get(i)[5];
//			
//			displayResponse.setBusinessPartner(bupaService.findByBpId(bpId));
//			displayResponse.setAddress(addressService.getAddressById(bpId));
//			displayResponse.setCommDetail(commService.getCommunicationById(bpId));
//			displayResponse.setIdentification(identificationService.findIdentificationById(bpId));
//			displayResponse.setPaymentTransactions(paymentService.findPaymentTransactionsById(bpId));
//			displayResponse.setStatus(true);
//			listDisplay.add(displayResponse);
//			
//		}
//		
//		return listDisplay;
//	}
//
}
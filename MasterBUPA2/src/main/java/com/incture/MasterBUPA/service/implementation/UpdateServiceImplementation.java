package com.incture.MasterBUPA.service.implementation;

import java.util.HashSet;
import java.util.Iterator;
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
public class UpdateServiceImplementation implements UpdateService {

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

		int id = updateDTO.getBpId();
		BupaDTO basicDetails = updateDTO.getBasicDetails();
		Set<AddressDTO> listAddress = updateDTO.getAddress();
		CommunicationDTO communications = updateDTO.getCommunications();
		IdentificationDTO identifications = updateDTO.getIdentifications();
		Set<PaymentDTO> listPayment = updateDTO.getPayment();
		
		boolean bdStatus=false,adStatus=false, paymentStatus=false,identificationStatus=false,commStatus=false;

		// =====================BUPA MAPPING=============================

		BupaDTO bupaEntity = new BupaDTO();
		List<Object[]> listBasicDetail = bupaRepo.getBasicDetails(id);
		bupaEntity.setFname((String) listBasicDetail.get(0)[1]);
		bupaEntity.setLname((String) listBasicDetail.get(0)[3]);
		bupaEntity.setsLanguage((String) listBasicDetail.get(0)[2]);
		bupaEntity.setsTerm1((String) listBasicDetail.get(0)[4]);
		bupaEntity.setsTerm2((String) listBasicDetail.get(0)[5]);
		bupaEntity.setsRole((String) listBasicDetail.get(0)[0]);
		// int status=0;

		if (bupaEntity.toString().equals(basicDetails.toString())) {
			// status=1;
			bdStatus=false;
			System.out.println("basic data matched");
		}
		else{
			System.out.println("basic data not matched");
		}

		// =====================ADDRESS MAPPING=============================


		Set<Object[]> listAddressDetail = addressRepo.getAddressDetail(id);
		
		Set<String> setString1 = new HashSet<>();
		Iterator iterator1=listAddress.iterator();
		while(iterator1.hasNext()){
			setString1.add(iterator1.next().toString());
		}

		System.out.println("demo check "+(setString1.toString().equals("[AddressDTO [city=, country=, email=, postalCode=, street=, street2=, street4=, telephone=]]")));
		
		if((listAddressDetail.isEmpty()==true)&&(setString1.toString().equals("[AddressDTO [city=, country=, email=, postalCode=, street=, street2=, street4=, telephone=]]")==false)){
			adStatus=true;
		}
		
		if((listAddressDetail.isEmpty()==false)&&(!(setString1.toString().equals("[AddressDTO [city=, country=, email=, postalCode=, street=, street2=, street4=, telephone=]]")))){
		Set<AddressDTO> storeSetAddress = new HashSet<>();

		adStatus=true;
		Set<String> setString2 = new HashSet<>();

		
		Iterator value = listAddressDetail.iterator();
		

		while (value.hasNext()) {
			AddressDTO addressDTO = new AddressDTO();
			Object[] objArray = (Object[]) value.next();
			System.out.println(objArray[1]);
			for (int i = 0; i < objArray.length; i++) {
				addressDTO.setCity((String) objArray[0]);
				addressDTO.setCountry((String) objArray[1]);
				addressDTO.setEmail((String) objArray[2]);
				addressDTO.setPostalCode((String) objArray[3]);
				addressDTO.setStreet((String) objArray[4]);
				addressDTO.setStreet2((String) objArray[5]);
				addressDTO.setStreet4((String) objArray[6]);
				addressDTO.setTelephone((String) objArray[7]);
			}
			storeSetAddress.add(addressDTO);
			setString2.add(addressDTO.toString());
		}

		System.out.println("LIST ADDRESS " + listAddress);
		System.out.println("STORESETADDRESS " + storeSetAddress);
		System.out.println("SET STRING 1" + setString1);
		System.out.println("SET STRING 2" + setString2);

		if (setString1.equals(setString2)) {
			adStatus=false;
			System.out.println("Address Matched");
		} else {
			System.out.println("Address not matched");
		}
		}
		else {
			//adStatus=false;
			System.out.println("Address not present or your input is empty "+adStatus);
		}
		System.out.println("Set String "+setString1);
		// =====================COMMUNICATION MAPPING=============================
		

		CommunicationDTO commEntity = new CommunicationDTO();
		List<Object[]> listCommDetails = communicationRepo.getCommDetails(id);
		
		if((listCommDetails.isEmpty()==true)&&(communications.toString().equals("CommunicationDTO [comments=, email=, extAddress=, fax=, mobile=, standCommMethod=, telephone=]")==false)){
			commStatus=true;
		}
		
		if((listCommDetails.isEmpty()==false) && !(communications.toString().equals("CommunicationDTO [comments=, email=, extAddress=, fax=, mobile=, standCommMethod=, telephone=]"))){
		
		commEntity.setComments((String) listCommDetails.get(0)[0]);
		commEntity.setEmail((String) listCommDetails.get(0)[1]);
		commEntity.setExtAddress((String) listCommDetails.get(0)[2]);
		commEntity.setFax((String) listCommDetails.get(0)[3]);
		commEntity.setMobile((String) listCommDetails.get(0)[4]);
		commEntity.setStandCommMethod((String) listCommDetails.get(0)[5]);
		commEntity.setTelephone((String) listCommDetails.get(0)[6]);
		if (commEntity.toString().equals(communications.toString())) {
			// status=1;
			commStatus=false;
			System.out.println("comm details matched");
		}
		}
		else {
			//
			System.out.println("Communication Details not present or your input is empty "+communications);
		}

		// =====================IDENTIFICATION MAPPING=============================
		 

		IdentificationDTO idEntity = new IdentificationDTO();
		List<Object[]> listIdDetails = identificationRepo.getIdentificationDetails(id);
		if((listIdDetails.isEmpty()==true)&&(identifications.toString().equals("IdentificationDTO [uname=, personnelNo=, birthPlace=, countryOfOrigin=, country=, employer=, maritalStatus=, nationality=, occupation=]")==false)){
			identificationStatus=true;
		}
		if((listIdDetails.isEmpty()==false)&&!(identifications.toString().equals("IdentificationDTO [uname=, personnelNo=, birthPlace=, countryOfOrigin=, country=, employer=, maritalStatus=, nationality=, occupation=]"))){
		identificationStatus=true;
		idEntity.setBirthPlace((String) listIdDetails.get(0)[0]);
		idEntity.setCountry((String) listIdDetails.get(0)[1]);
		idEntity.setCountryOfOrigin((String) listIdDetails.get(0)[2]);
		idEntity.setEmployer((String) listIdDetails.get(0)[3]);
		idEntity.setMaritalStatus((String) listIdDetails.get(0)[4]);
		idEntity.setNationality((String) listIdDetails.get(0)[5]);
		idEntity.setOccupation((String) listIdDetails.get(0)[6]);
		idEntity.setPersonnelNo((String) listIdDetails.get(0)[7]);
		idEntity.setUname((String) listIdDetails.get(0)[8]);
		if (idEntity.toString().equals(identifications.toString())) {
			// status=1;
			identificationStatus=false;
			System.out.println("Identification details matched");

		}
		}
		else {
			//identificationStatus=false;
			System.out.println("NOT PRESENT IDENTIFICATION "+identifications);
		}

		// =====================PAYMENTTRANSACTION MAPPING=============================
		

		
		Set<Object[]> listPaymentDetail = paymentRepo.getPaymentsDetail(id);
		
		Set<String> setString3 = new HashSet<>();
		Iterator iterator3=listPayment.iterator();
		while(iterator3.hasNext()){
			setString3.add(iterator3.next().toString());
		}

		if((listPaymentDetail.isEmpty()==true)&&(setString3.toString().equals("[PaymentDTO [id=, pCity=, bankKey=, bankAcct=, controlKey=, refDoc=, iban=]]")==false)){
			paymentStatus=true;
		}
		
		if((listPaymentDetail.isEmpty()==false)&&!(setString3.toString().equals("[PaymentDTO [id=, pCity=, bankKey=, bankAcct=, controlKey=, refDoc=, iban=]]"))){
		Set<PaymentDTO> storeSetPayment = new HashSet<>();

		paymentStatus=true;
		Set<String> setString4 = new HashSet<>();

		System.out.println(listPaymentDetail.size());
		Iterator value1= listPaymentDetail.iterator();
		
		while(iterator3.hasNext()){
			setString3.add(iterator3.next().toString());
		}

		while (value1.hasNext()) {
			PaymentDTO paymentDTO = new PaymentDTO();
			Object[] objArray1 = (Object[]) value1.next();
			System.out.println(objArray1[1]);
			for (int i = 0; i < objArray1.length; i++) {
				paymentDTO.setBankAcct((String) objArray1[0]);
				paymentDTO.setBankKey((String) objArray1[1]);
				paymentDTO.setControlKey((String) objArray1[2]);
				paymentDTO.setIban((String) objArray1[3]);
				paymentDTO.setId((String) objArray1[6]);
				paymentDTO.setpCity((String) objArray1[4]);
				paymentDTO.setRefDoc((String) objArray1[5]);
				
			}
			storeSetPayment.add(paymentDTO);
			setString4.add(paymentDTO.toString());
		}

		System.out.println("LIST PAYMENT " + listAddress);
		System.out.println("STORESETPAYMENT " + storeSetPayment);
		System.out.println("SET STRING 3" + setString3);
		System.out.println("SET STRING 4" + setString4);

		if (setString3.equals(setString4)) {
			System.out.println("Payment Matched");
			paymentStatus=false;
		} else {
			System.out.println("Payment not matched");
		}
		}
		else {
			
			System.out.println("payment not present or your input is null "+setString3);
		}
		
		//================================
		
		if(bdStatus==false&&adStatus==false&&commStatus==false&&identificationStatus==false&&paymentStatus==false){
			System.out.println("===NO UPDATE REQUIRED===");
		}
		else{
			System.out.println("===UPDATE REQUIRED===");
		}
		return null;
		
		
	}

}

package com.incture.MasterBUPA.service.implementation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.incture.MasterBUPA.dao.bupa.AddressRepository;
import com.incture.MasterBUPA.dao.bupa.BUPARepository;
import com.incture.MasterBUPA.dao.bupa.CommunicationRepository;
import com.incture.MasterBUPA.dao.bupa.HistoryRepository;
import com.incture.MasterBUPA.dao.bupa.IdentificationRepository;
import com.incture.MasterBUPA.dao.bupa.PaymentRepository;
import com.incture.MasterBUPA.dto.request.AddressDTO;
import com.incture.MasterBUPA.dto.request.BupaDTO;
import com.incture.MasterBUPA.dto.request.CommunicationDTO;
import com.incture.MasterBUPA.dto.request.IdentificationDTO;
import com.incture.MasterBUPA.dto.request.PaymentDTO;
import com.incture.MasterBUPA.dto.request.UpdateDTO;
import com.incture.MasterBUPA.dto.response.IdDto;
import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.entity.CommunicationDetail;
import com.incture.MasterBUPA.entity.HistoryDO;
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
import com.incture.MasterBUPA.service.abstraction.DisplayService;
import com.incture.MasterBUPA.service.abstraction.HistoryService;
import com.incture.MasterBUPA.service.abstraction.IdentificationService;
import com.incture.MasterBUPA.service.abstraction.PaymentTransactionService;
import com.incture.MasterBUPA.service.abstraction.UpdateService;

@Service
public class UpdateServiceImplementation implements UpdateService {

	@Autowired
	private BUPARepository bupaRepo;

	@Autowired
	private HistoryRepository historyRepo;

	@Autowired
	private AddressRepository addressRepo;

	@Autowired
	private CommunicationRepository communicationRepo;

	@Autowired
	private IdentificationRepository identificationRepo;

	@Autowired
	private PaymentRepository paymentRepo;

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

	@Autowired
	private DisplayService displayService;

	@Autowired
	private HistoryService historyService;

	@Override
	public IdDto update(UpdateDTO updateDTO) {
		// TODO Auto-generated method stub

		int id = updateDTO.getBpId();
		BupaDTO basicDetails = updateDTO.getBasicDetails();
		Set<AddressDTO> listAddress = updateDTO.getAddress();
		CommunicationDTO communications = updateDTO.getCommunications();
		IdentificationDTO identifications = updateDTO.getIdentifications();
		Set<PaymentDTO> listPayment = updateDTO.getPayment();

		boolean bdStatus = false, adStatus = false, paymentStatus = false, identificationStatus = false,
				commStatus = false;

		// =====================BUPA MAPPING=============================

		BupaDTO bupaEntity = new BupaDTO();
		List<Object[]> listBasicDetail = bupaRepo.getBasicDetails(id);
		System.out.println("listBasicDetail size   " + listBasicDetail.size());
		bupaEntity.setFname((String) listBasicDetail.get(0)[1]);
		bupaEntity.setLname((String) listBasicDetail.get(0)[3]);
		bupaEntity.setsLanguage((String) listBasicDetail.get(0)[2]);
		bupaEntity.setsTerm1((String) listBasicDetail.get(0)[4]);
		bupaEntity.setsTerm2((String) listBasicDetail.get(0)[5]);
		bupaEntity.setsRole((String) listBasicDetail.get(0)[0]);
		// int status=0;

		System.out.println(" bupa entity " + bupaEntity);

		System.out.println(" bupa basic details " + basicDetails);

		if (bupaEntity.toString().equals(basicDetails.toString())) {
			// status=1;
			bdStatus = false;
			System.out.println("basic data matched");
		} else {
			bdStatus = true;
			System.out.println("basic data not matched");
		}

		// =====================ADDRESS MAPPING=============================

		Set<Object[]> listAddressDetail = addressRepo.getAddressDetail(id);

		Set<String> setString1 = new HashSet<>();
		Iterator iterator1 = listAddress.iterator();
		while (iterator1.hasNext()) {
			setString1.add(iterator1.next().toString());
		}

		if ((listAddressDetail.isEmpty() == true) && (listAddress.isEmpty() == false)) {
			adStatus = true;
		}

		if ((listAddressDetail.isEmpty() == false) && (listAddress.isEmpty() == true)) {
			adStatus = true;
		}

		if ((listAddressDetail.isEmpty() == false) && (!(listAddress.isEmpty()))) {
			Set<AddressDTO> storeSetAddress = new HashSet<>();

			adStatus = true;
			Set<String> setString2 = new HashSet<>();

			Iterator value = listAddressDetail.iterator();

			while (value.hasNext()) {
				AddressDTO addressDTO = new AddressDTO();
				Object[] objArray = (Object[]) value.next();
				// System.out.println(objArray[1]);
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

			System.out.println("SET STRING 1" + setString1);
			System.out.println("SET STRING 2" + setString2);

			if (setString1.equals(setString2)) {
				adStatus = false;
				System.out.println("Address Matched");
			} else {

				System.out.println("Address not matched");
			}
		} else {
			// adStatus=false;
			System.out.println("Address not present or your input is empty " + adStatus);
		}

		// =====================COMMUNICATION
		// MAPPING=============================

		CommunicationDTO commEntity = new CommunicationDTO();
		List<Object[]> listCommDetails = communicationRepo.getCommDetails(id);

		if ((listCommDetails.isEmpty() == true) && (communications.toString().equals(
				"CommunicationDTO [comments=, email=, extAddress=, fax=, mobile=, standCommMethod=, telephone=]") == false)) {
			commStatus = true;
		}

		if ((listCommDetails.isEmpty() == false) && (communications.toString().equals(
				"CommunicationDTO [comments=, email=, extAddress=, fax=, mobile=, standCommMethod=, telephone=]") == true)) {
			commStatus = true;
		}

		if ((listCommDetails.isEmpty() == false) && !(communications.toString().equals(
				"CommunicationDTO [comments=, email=, extAddress=, fax=, mobile=, standCommMethod=, telephone=]"))) {

			commStatus = true;
			commEntity.setComments((String) listCommDetails.get(0)[0]);
			commEntity.setEmail((String) listCommDetails.get(0)[1]);
			commEntity.setExtAddress((String) listCommDetails.get(0)[2]);
			commEntity.setFax((String) listCommDetails.get(0)[3]);
			commEntity.setMobile((String) listCommDetails.get(0)[4]);
			commEntity.setStandCommMethod((String) listCommDetails.get(0)[5]);
			commEntity.setTelephone((String) listCommDetails.get(0)[6]);

			System.out.println(commEntity);
			System.out.println(communications);
			if (commEntity.toString().equals(communications.toString())) {
				// status=1;
				commStatus = false;
				System.out.println("comm details matched");
			} else {
				System.out.println("Comm details not matched");
			}
		} else {

			System.out.println("Communication Details not present or your input is empty " + communications);
		}

		// =====================IDENTIFICATION
		// MAPPING=============================

		IdentificationDTO idEntity = new IdentificationDTO();
		List<Object[]> listIdDetails = identificationRepo.getIdentificationDetails(id);
		if ((listIdDetails.isEmpty() == true) && (identifications.toString().equals(
				"IdentificationDTO [uname=, personnelNo=, birthPlace=, countryOfOrigin=, country=, employer=, maritalStatus=, nationality=, occupation=]") == false)) {
			identificationStatus = true;
		}

		if ((listIdDetails.isEmpty() == false) && (identifications.toString().equals(
				"IdentificationDTO [uname=, personnelNo=, birthPlace=, countryOfOrigin=, country=, employer=, maritalStatus=, nationality=, occupation=]") == true)) {
			identificationStatus = true;
		}

		if ((listIdDetails.isEmpty() == false) && !(identifications.toString().equals(
				"IdentificationDTO [uname=, personnelNo=, birthPlace=, countryOfOrigin=, country=, employer=, maritalStatus=, nationality=, occupation=]"))) {
			identificationStatus = true;
			idEntity.setBirthPlace((String) listIdDetails.get(0)[0]);
			idEntity.setCountry((String) listIdDetails.get(0)[1]);
			idEntity.setCountryOfOrigin((String) listIdDetails.get(0)[2]);
			idEntity.setEmployer((String) listIdDetails.get(0)[3]);
			idEntity.setMaritalStatus((String) listIdDetails.get(0)[4]);
			idEntity.setNationality((String) listIdDetails.get(0)[5]);
			idEntity.setOccupation((String) listIdDetails.get(0)[6]);
			idEntity.setPersonnelNo((String) listIdDetails.get(0)[7]);
			idEntity.setUname((String) listIdDetails.get(0)[8]);

			System.out.println(idEntity);
			System.out.println(identifications);
			if (idEntity.toString().equals(identifications.toString())) {
				// status=1;
				identificationStatus = false;
				System.out.println("Identification details matched");

			} else {
				System.out.println("Identification details not matched ");
			}
		} else {
			// identificationStatus=false;
			System.out.println("NOT PRESENT IDENTIFICATION " + identifications);
		}

		// =====================PAYMENTTRANSACTION
		// MAPPING=============================

		Set<Object[]> listPaymentDetail = paymentRepo.getPaymentsDetail(id);

		Set<String> setString3 = new HashSet<>();
		Iterator iterator3 = listPayment.iterator();
		while (iterator3.hasNext()) {
			setString3.add(iterator3.next().toString());
		}

		if ((listPaymentDetail.isEmpty() == true) && (listPayment.isEmpty() == false)) {
			paymentStatus = true;
		}

		if ((listPaymentDetail.isEmpty() == false) && (listPayment.isEmpty() == true)) {
			paymentStatus = true;
		}

		if ((listPaymentDetail.isEmpty() == false) && !(listPayment.isEmpty())) {
			Set<PaymentDTO> storeSetPayment = new HashSet<>();

			paymentStatus = true;
			Set<String> setString4 = new HashSet<>();

			Iterator value1 = listPaymentDetail.iterator();

			while (iterator3.hasNext()) {
				setString3.add(iterator3.next().toString());
			}

			while (value1.hasNext()) {
				PaymentDTO paymentDTO = new PaymentDTO();
				Object[] objArray1 = (Object[]) value1.next();

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

			System.out.println("SET STRING 3" + setString3);
			System.out.println("SET STRING 4" + setString4);

			if (setString3.equals(setString4)) {
				System.out.println("Payment Matched");
				paymentStatus = false;
			} else {
				System.out.println("Payment not matched");
			}
		} else {

			System.out.println("payment not present or your input is null " + setString3);
		}

		// ================================

		if (bdStatus == false && adStatus == false && commStatus == false && identificationStatus == false
				&& paymentStatus == false) {
			IdDto idDto = new IdDto();
			idDto.setBp_id(id);
			idDto.setRole_id(bupaRepo.getRoleIdByBpId(id));
			idDto.setStatus(false);

			System.out.println("===NO UPDATE REQUIRED===");
			return idDto;
		} else {

			HistoryDO historyDo = new HistoryDO();
			GsonBuilder builder = new GsonBuilder();
			builder.setPrettyPrinting();

			Gson gson = builder.create();

			historyDo.setBpId(id);
			System.out.println(displayService.findEachData(id).toString() + "  HISTORY DATA");
			String saveBupaJSON = gson.toJson(displayService.findEachData(id));
			System.out.println("GSON FROMAT IN STRING:" + saveBupaJSON);
			historyDo.setHistoryData(saveBupaJSON);
			historyDo.setDate();
			historyDo.setVersion(historyService.findVersion(id) + 1);
			historyRepo.save(historyDo);
			System.out.println(historyDo + "    HISTORY DO");

			System.out.println("===UPDATE REQUIRED===");

			if (bdStatus == true) {
				BusinessPartner businessPartner = new BusinessPartner();
				businessPartner = BupaMapper.checkBP(basicDetails);
				businessPartner.setBpId(id);
				businessPartner.setRoleId(bupaRepo.getRoleIdByBpId(id));
				bupaRepo.save(businessPartner);
			}
			if (commStatus == true) {
				CommunicationDetail communiDetail = new CommunicationDetail();
				communiDetail = CommunicationMapper.checkCommunication(communications, id);
				if (communications.toString().equals(
						"CommunicationDTO [comments=, email=, extAddress=, fax=, mobile=, standCommMethod=, telephone=]")) {
					Integer commId = communicationRepo.getCommunicationIdbyBpid(id);
					communicationRepo.deleteById(commId);
				} else {
					if (communicationRepo.getCommunicationIdbyBpid(id) == null) {
						communicationRepo.save(communiDetail);
					} else {
						communiDetail.setCommunicationId(communicationRepo.getCommunicationIdbyBpid(id));
						communicationRepo.save(communiDetail);
					}
				}
			}
			if (identificationStatus == true) {
				Identification identification = new Identification();
				identification = IdentificationMapper.checkIdentification(identifications, id);
				if ((identifications.toString().equals(
						"IdentificationDTO [uname=, personnelNo=, birthPlace=, countryOfOrigin=, country=, employer=, maritalStatus=, nationality=, occupation=]") == true)) {
					Integer identificationId = identificationRepo.getIdentificationIdbyBpid(id);
					identificationRepo.deleteById(identificationId);
				} else {
					if (identificationRepo.getIdentificationIdbyBpid(id) == null) {
						identificationRepo.save(identification);
					} else {
						identification.setIdentificationId(identificationRepo.getIdentificationIdbyBpid(id));
						identificationRepo.save(identification);
					}
				}
			}
			if (adStatus == true) {
				List<AddressDTO> listAddressDto = new ArrayList<AddressDTO>(listAddress);
				List<Address> addressList = AddressMapper.checkAddress(listAddressDto, id);
				// addressRepo.deleteAddressById(id);

				if (setString1.toString().equals(
						"[AddressDTO [city=, country=, email=, postalCode=, street=, street2=, street4=, telephone=]]") == true) {
					List<Integer> listBpId = addressRepo.findBpList(id);
					for (int i = 0; i < listBpId.size(); i++) {
						addressRepo.deleteById(listBpId.get(i));
					}
				} else {
					List<Integer> listBpId = addressRepo.findBpList(id);
					for (int i = 0; i < listBpId.size(); i++) {
						addressRepo.deleteById(listBpId.get(i));
					}
					for (int i = 0; i < addressList.size(); i++) {
						Address address = addressList.get(i);
						addressRepo.save(address);
					}
				}
			}
			if (paymentStatus == true) {

				List<PaymentDTO> listPaymentDto = new ArrayList<PaymentDTO>(listPayment);
				List<PaymentTransactions> paymentList = PaymentMapper.checkPayment(listPaymentDto, id);
				// addressRepo.deleteAddressById(id);

				if (setString3.toString().equals(
						"[PaymentDTO [id=, pCity=, bankKey=, bankAcct=, controlKey=, refDoc=, iban=]]") == true) {
					List<Integer> listBpId = paymentRepo.findBpList(id);
					for (int i = 0; i < listBpId.size(); i++) {
						paymentRepo.deleteById(listBpId.get(i));

					}
				} else {
					List<Integer> listBpId = paymentRepo.findBpList(id);
					for (int i = 0; i < listBpId.size(); i++) {
						paymentRepo.deleteById(listBpId.get(i));

					}
					for (int i = 0; i < paymentList.size(); i++) {
						PaymentTransactions paymentTransaction = paymentList.get(i);
						paymentRepo.save(paymentTransaction);
					}
				}
			}
			IdDto idDto = new IdDto();
			idDto.setBp_id(id);
			idDto.setRole_id(bupaRepo.getRoleIdByBpId(id));
			idDto.setStatus(true);
			return idDto;

		}

	}

}

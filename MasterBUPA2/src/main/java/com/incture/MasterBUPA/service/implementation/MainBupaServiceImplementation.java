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
import com.incture.MasterBUPA.entity.CommunicationDetail;
import com.incture.MasterBUPA.entity.Identification;
import com.incture.MasterBUPA.entity.PaymentTransactions;
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
public class MainBupaServiceImplementation implements MainBupaService {

	private BusinessPartner businessPartner = new BusinessPartner();
	private Address address = new Address();
	private CommunicationDetail communication = new CommunicationDetail();
	private PaymentTransactions payment = new PaymentTransactions();
	private Identification identity = new Identification();
	
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

		// Business Partner DTO MAPPING
		businessPartner.setBpRole(bupaDTO.getsRole());
		businessPartner.setRoleId(UUID.randomUUID());
		businessPartner.setFirstName(bupaDTO.getFname());
		businessPartner.setLangKey(bupaDTO.getsLanguage());
		businessPartner.setLastName(bupaDTO.getLname());
		businessPartner.setSearchTerm1(bupaDTO.getsTerm1());
		businessPartner.setSearchTerm2(bupaDTO.getsTerm2());
		bupaService.save(businessPartner);

		// ADDRESS DTO MAPPING
		for (AddressDTO addressDto : addressDTO) {
			bp_id=businessPartner.getBpId();
			address.setBpId(businessPartner.getBpId());
			address.setCity(addressDto.getCity());
			address.setCountry(addressDto.getCountry());
			address.setEmail(addressDto.getEmail());
			address.setPostalCode(addressDto.getPostalCode());
			address.setStreet1(addressDto.getStreet());
			address.setStreet2(addressDto.getStreet2());
			address.setStreet4(addressDto.getStreet4());
			address.setTelephone(addressDto.getTelephone());
			addressService.save(address);
		}

		// COMMUNICATION DETAILS DTO MAPPING
		communication.setBpId(businessPartner.getBpId());
		communication.setComments(communicationDTO.getComments());
		communication.setEmail(communicationDTO.getEmail());
		communication.setExtAddress(communicationDTO.getExtAddress());
		communication.setFax(communicationDTO.getFax());
		communication.setMobile(communicationDTO.getMobile());
		communication.setStandCommMethod(communicationDTO.getStandCommMethod());
		communication.setTelephone(communicationDTO.getTelephone());
		communicationService.save(communication);

		identity.setBpId(businessPartner.getBpId());
		identity.setBirthPlace(identificationDTO.getBirthPlace());
		identity.setCitizenship(identificationDTO.getCountry());
		identity.setCountryOfOrigin(identificationDTO.getCountryOfOrigin());
		identity.setEmployeer(identificationDTO.getEmployer());
		identity.setMaritalStatus(identificationDTO.getMaritalStatus());
		identity.setNationalityStatus(identificationDTO.getNationality());
		identity.setOccupation(identificationDTO.getOccupation());
		identity.setPersonnelNo(identificationDTO.getPersonnelNo());
		identity.setUserName(identificationDTO.getUname());
		identificationService.save(identity);

		// payment DTO mapping
		for (PaymentDTO paymentDto : paymentDTO) {
			payment.setBpId(businessPartner.getBpId());
			payment.setBankAccount(paymentDto.getBankAcct());
			payment.setBankKey(paymentDto.getBankKey());
			payment.setControlKey(paymentDto.getControlKey());
			payment.setiBAN(paymentDto.getIban());
			payment.setPaymentCity(paymentDto.getpCity());
			payment.setReferenceDocument(paymentDto.getRefDoc());
			paymentTransactionService.save(payment);
		}
		
		return bp_id;

	}

}

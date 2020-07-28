package com.incture.MasterBUPA.service.implementation;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.request.AddressDTO;
import com.incture.MasterBUPA.dto.request.BupaDTO;
import com.incture.MasterBUPA.dto.request.CommunicationDTO;
import com.incture.MasterBUPA.dto.request.IdentificationDTO;
import com.incture.MasterBUPA.dto.request.PaymentDTO;
import com.incture.MasterBUPA.dto.request.SaveBupa;
import com.incture.MasterBUPA.dto.response.IdDto;
import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.BusinessPartner;
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
 * Mapping the DTO Services to MODEL services
 */
@Service
@Transactional
public class MainBupaServiceImplementation implements MainBupaService {

	// private BusinessPartner businessPartner = new BusinessPartner();
	// private Address address = new Address();
	// private CommunicationDetail communication = new CommunicationDetail();
	// private PaymentTransactions payment = new PaymentTransactions();
	// private Identification identity = new Identification();

	public Integer bp_id, role_id;
	public boolean status;
	public List<Object[]> checkIfExists = null;

	public IdDto idDto;

	/**
	 * @return the bp_id
	 */
	public Integer getBp_id() {
		return bp_id;
	}

	/**
	 * @param bp_id
	 *            the bp_id to set
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
	public IdDto save(SaveBupa saveBupa) {

		idDto = new IdDto();
		

		List<AddressDTO> addressDTO = saveBupa.getAddress();
		BupaDTO bupaDTO = saveBupa.getBasicDetails();
		CommunicationDTO communicationDTO = saveBupa.getCommunications();
		IdentificationDTO identificationDTO = saveBupa.getIdentifications();
		List<PaymentDTO> paymentDTO = saveBupa.getPayment();

		BusinessPartner businessPartner = new BusinessPartner();
		businessPartner.setBpId(0);

		BusinessPartner businessPartner2 = new BusinessPartner();
		businessPartner2 = BupaMapper.checkBP(bupaDTO);

		if (BupaMapper.checkBP(bupaDTO) != null) {

			System.out.println("Inside if....");
			checkIfExists = bupaService.checkIfExists(BupaMapper.checkBP(bupaDTO).getBpRole(),
					BupaMapper.checkBP(bupaDTO).getFirstName(), BupaMapper.checkBP(bupaDTO).getLangKey(),
					BupaMapper.checkBP(bupaDTO).getLastName(), BupaMapper.checkBP(bupaDTO).getSearchTerm1(),
					BupaMapper.checkBP(bupaDTO).getSearchTerm2());
			System.out.println("Checkif exists " + checkIfExists);

			// if(checkIfExists!=null){
			// ids=checkIfExists.get(0);}

			if (checkIfExists.isEmpty()) {
				status = true;
			} else {

				System.out.println(Integer.valueOf(checkIfExists.get(0)[0].toString()) + " "
						+ Integer.valueOf(checkIfExists.get(0)[1].toString()) + "bdkbhkdb");
				status = false;
			}

			System.out.println("Status is " + status);

			if (status == true) {
				businessPartner2.setRoleId((bupaService.findRoleId(businessPartner2.getBpRole())) + 1);
				// businessPartner =
				// bupaService.save(BupaMapper.checkBP(bupaDTO));
				businessPartner = bupaService.save(businessPartner2);
			}

		}

		if (status == true) {
			bp_id = businessPartner.getBpId();
			role_id = businessPartner.getRoleId();

			System.out.println("business partner id" + bp_id);
			System.out.println("role id" + role_id);

			idDto.setBp_id(bp_id);
			idDto.setRole_id(role_id);
			idDto.setStatus(true);
		}

		else {

			System.out.println("You are in else part and status is " + status);
			role_id = Integer.valueOf(checkIfExists.get(0)[0].toString());
			bp_id = Integer.valueOf(checkIfExists.get(0)[1].toString());
			idDto.setBp_id(bp_id);
			idDto.setRole_id(role_id);
			idDto.setStatus(false);
			return idDto;
		}

		List<Address> address = AddressMapper.checkAddress(addressDTO, bp_id);
		for (Address address2 : address) {
			addressService.save(address2);
		}

		if (CommunicationMapper.checkCommunication(communicationDTO, bp_id) != null) {
			communicationService.save(CommunicationMapper.checkCommunication(communicationDTO, bp_id));
		}

		if (IdentificationMapper.checkIdentification(identificationDTO, bp_id) != null) {
			identificationService.save(IdentificationMapper.checkIdentification(identificationDTO, bp_id));
		}

		List<PaymentTransactions> paymentList = PaymentMapper.checkPayment(paymentDTO, bp_id);
		for (PaymentTransactions pt : paymentList) {
			paymentTransactionService.save(pt);
		}

		return idDto;

	}

}

package com.incture.MasterBUPA.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.incture.MasterBUPA.dto.response.DisplayResponse;
import com.incture.MasterBUPA.dto.response.PageResponse;
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

@RestController
@RequestMapping("/find")
public class DisplayController {
	
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
	private DisplayService displayService;
	
	@GetMapping("/basicData")
	public List<BusinessPartner> findBusinessPartner(){
		return bupaService.getAllBusinessPartner();
	}
	
	@GetMapping("/address")
	public List<Address> findAddress(){
		return addressService.getAllAddress();
	}
	
	@GetMapping("/communication")
	public List<CommunicationDetail> findCommunication(){
		return communicationService.getCommunication();
	}
	
	@GetMapping("/identification")
	public List<Identification> findIdentification(){
		return identificationService.findIdentification();
	}
	
	@GetMapping("/payments")
	public List<PaymentTransactions> findPayment(){
		return paymentService.findPaymentTransactions();
	}
	
	@GetMapping("/findByBpId/{bpId}")
	public DisplayResponse findEveryThing(@PathVariable Integer bpId){
		return displayService.findEachData(bpId);
	}
	
	
	@GetMapping("/findByRoleId/{roleId}")
	public DisplayResponse findEveryThingByRoleId(@PathVariable Integer roleId){
		return displayService.findEachDatabyRoleId(roleId);
	}
	
	@GetMapping("/findByFirstName/{firstName}")
	public List<DisplayResponse> findEverythingbyfirstName(@PathVariable String firstName){
		return displayService.findEachDatabyFirstName(firstName);
	}
	
	@GetMapping("/findByLastName/{lastName}")
	public List<DisplayResponse> findEverythingbyLastName(@PathVariable String lastName){
		return displayService.findEachDatabyLastName(lastName);
	}
	
	@GetMapping("/findByRole/{role}")
	public List<DisplayResponse> findEverythingbyRole(@PathVariable String role){
		return displayService.findEachDatabyRole(role);
	}
	
	@GetMapping("/page")
	public PageResponse findBpByPage(@RequestParam(defaultValue="0") Integer pno, @RequestParam(defaultValue="8") Integer psize,@RequestParam(defaultValue="bpId") String sortParam,@RequestParam(defaultValue="Ascending") String orderBy){
		return bupaService.findBpByPage(pno, psize,sortParam,orderBy);
		
	}
	
	

}

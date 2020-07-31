package com.incture.MasterBUPA.dto.response;

import java.util.List;

import com.incture.MasterBUPA.dto.request.AddressDTO;
import com.incture.MasterBUPA.dto.request.CommunicationDTO;
import com.incture.MasterBUPA.dto.request.IdentificationDTO;
import com.incture.MasterBUPA.dto.request.PaymentDTO;
import com.incture.MasterBUPA.entity.BusinessPartner;


public class DisplayResponse {
	
	private BusinessPartner businessPartner;
	private List<AddressDTO> address;
	private CommunicationDTO commDetail;
	private IdentificationDTO identification;
	private List<PaymentDTO> paymentTransactions;
	private Boolean status;
	/**
	 * @return the businessPartner
	 */
	public BusinessPartner getBusinessPartner() {
		return businessPartner;
	}
	
	/**
	 * @return the address
	 */
	public List<AddressDTO> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(List<AddressDTO> address) {
		this.address = address;
	}

	/**
	 * @return the commDetail
	 */
	public CommunicationDTO getCommDetail() {
		return commDetail;
	}

	/**
	 * @param commDetail the commDetail to set
	 */
	public void setCommDetail(CommunicationDTO commDetail) {
		this.commDetail = commDetail;
	}

	/**
	 * @return the identification
	 */
	public IdentificationDTO getIdentification() {
		return identification;
	}

	/**
	 * @param identification the identification to set
	 */
	public void setIdentification(IdentificationDTO identification) {
		this.identification = identification;
	}

	/**
	 * @return the paymentTransactions
	 */
	public List<PaymentDTO> getPaymentTransactions() {
		return paymentTransactions;
	}

	/**
	 * @param paymentTransactions the paymentTransactions to set
	 */
	public void setPaymentTransactions(List<PaymentDTO> paymentTransactions) {
		this.paymentTransactions = paymentTransactions;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @param businessPartner the businessPartner to set
	 */
	public void setBusinessPartner(BusinessPartner businessPartner) {
		this.businessPartner = businessPartner;
	}

	@Override
	public String toString() {
		return "DisplayResponse [businessPartner=" + businessPartner + ", address=" + address + ", commDetail="
				+ commDetail + ", identification=" + identification + ", paymentTransactions=" + paymentTransactions
				+ ", status=" + status + ", getBusinessPartner()=" + getBusinessPartner() + ", getAddress()="
				+ getAddress() + ", getCommDetail()=" + getCommDetail() + ", getIdentification()=" + getIdentification()
				+ ", getPaymentTransactions()=" + getPaymentTransactions() + ", getStatus()=" + getStatus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}

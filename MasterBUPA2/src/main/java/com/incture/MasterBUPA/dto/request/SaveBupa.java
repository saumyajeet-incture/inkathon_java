package com.incture.MasterBUPA.dto.request;

import java.util.List;

import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.entity.CommunicationDetail;
import com.incture.MasterBUPA.entity.Identification;
import com.incture.MasterBUPA.entity.PaymentTransactions;

public class SaveBupa {
	private BusinessPartner  businessPartner;
	private Address address;
	private CommunicationDetail communicationDetail;
	private Identification identification;
	private PaymentTransactions paymentTransaction;
	/**
	 * @return the businessPartner
	 */
	public BusinessPartner getBusinessPartner() {
		return businessPartner;
	}
	/**
	 * @param businessPartner the businessPartner to set
	 */
	public SaveBupa setBusinessPartner(BusinessPartner businessPartner) {
		this.businessPartner = businessPartner;
		return this;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public SaveBupa setAddress(Address address) {
		this.address = address;
		return this;
	}
	/**
	 * @return the communicationDetail
	 */
	public CommunicationDetail getCommunicationDetail() {
		return communicationDetail;
	}
	/**
	 * @param communicationDetail the communicationDetail to set
	 */
	public SaveBupa setCommunicationDetail(CommunicationDetail communicationDetail) {
		this.communicationDetail = communicationDetail;
		return this;
	}
	/**
	 * @return the identification
	 */
	public Identification getIdentification() {
		return identification;
	}
	/**
	 * @param identification the identification to set
	 */
	public SaveBupa setIdentification(Identification identification) {
		this.identification = identification;
		return this;
	}
	/**
	 * @return the paymentTransaction
	 */
	public PaymentTransactions getPaymentTransaction() {
		return paymentTransaction;
	}
	/**
	 * @param paymentTransaction the paymentTransaction to set
	 */
	public SaveBupa setPaymentTransaction(PaymentTransactions paymentTransaction) {
		this.paymentTransaction = paymentTransaction;
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SaveBupa [businessPartner=" + businessPartner + ", address=" + address + ", communicationDetail="
				+ communicationDetail + ", identification=" + identification + ", paymentTransaction="
				+ paymentTransaction + "]";
	}
	
	
	
	

}

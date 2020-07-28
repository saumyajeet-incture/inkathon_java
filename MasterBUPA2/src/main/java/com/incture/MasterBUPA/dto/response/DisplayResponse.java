package com.incture.MasterBUPA.dto.response;

import java.util.List;

import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.entity.CommunicationDetail;
import com.incture.MasterBUPA.entity.Identification;
import com.incture.MasterBUPA.entity.PaymentTransactions;


public class DisplayResponse {
	
	private BusinessPartner businessPartner;
	private List<Address> address;
	private CommunicationDetail commDetail;
	private Identification identification;
	private List<PaymentTransactions> paymentTransactions;
	/**
	 * @return the businessPartner
	 */
	public BusinessPartner getBusinessPartner() {
		return businessPartner;
	}
	/**
	 * @param businessPartner the businessPartner to set
	 */
	public void setBusinessPartner(BusinessPartner businessPartner) {
		this.businessPartner = businessPartner;
	}
	/**
	 * @return the address
	 */
	public List<Address> getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	/**
	 * @return the commDetail
	 */
	public CommunicationDetail getCommDetail() {
		return commDetail;
	}
	/**
	 * @param commDetail the commDetail to set
	 */
	public void setCommDetail(CommunicationDetail commDetail) {
		this.commDetail = commDetail;
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
	public void setIdentification(Identification identification) {
		this.identification = identification;
	}
	/**
	 * @return the paymentTransactions
	 */
	public List<PaymentTransactions> getPaymentTransactions() {
		return paymentTransactions;
	}
	/**
	 * @param paymentTransactions the paymentTransactions to set
	 */
	public void setPaymentTransactions(List<PaymentTransactions> paymentTransactions) {
		this.paymentTransactions = paymentTransactions;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DisplayResponse [businessPartner=" + businessPartner + ", address=" + address + ", commDetail="
				+ commDetail + ", identification=" + identification + ", paymentTransactions=" + paymentTransactions
				+ "]";
	}
	
	

}

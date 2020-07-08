package com.incture.MasterBUPA.dto.request;

import java.util.List;

/**
 * @author ASHU
 *
 */
public class SaveBupa {
	private List<BupaDTO>  basicDetails;
	private List<AddressDTO> address;
	private List<CommunicationDTO> communications;
	private List<IdentificationDTO> identifications;
	private List<PaymentDTO> payment;
	/**
	 * @return the basicDetails
	 */
	public List<BupaDTO> getBasicDetails() {
		return basicDetails;
	}
	/**
	 * @param basicDetails the basicDetails to set
	 */
	public void setBasicDetails(List<BupaDTO> basicDetails) {
		this.basicDetails = basicDetails;
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
	 * @return the communications
	 */
	public List<CommunicationDTO> getCommunications() {
		return communications;
	}
	/**
	 * @param communications the communications to set
	 */
	public void setCommunications(List<CommunicationDTO> communications) {
		this.communications = communications;
	}
	/**
	 * @return the identifications
	 */
	public List<IdentificationDTO> getIdentifications() {
		return identifications;
	}
	/**
	 * @param identifications the identifications to set
	 */
	public void setIdentifications(List<IdentificationDTO> identifications) {
		this.identifications = identifications;
	}
	/**
	 * @return the payment
	 */
	public List<PaymentDTO> getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(List<PaymentDTO> payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "SaveBupa [basicDetails=" + basicDetails + ", address=" + address + ", communications=" + communications
				+ ", identifications=" + identifications + ", payment=" + payment + "]";
	}
	
	

}

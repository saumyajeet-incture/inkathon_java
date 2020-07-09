package com.incture.MasterBUPA.dto.request;

import java.util.List;

/**
 * @author ASHU
 * 
 *
 */
public class SaveBupa {
	private  BupaDTO basicDetails;
	private List<AddressDTO> address;
	private CommunicationDTO communications;
	private IdentificationDTO identifications;
	private List<PaymentDTO> payment;
	/**
	 * @return the basicDetails
	 */
	public BupaDTO getBasicDetails() {
		return basicDetails;
	}
	/**
	 * @param basicDetails the basicDetails to set
	 */
	public void setBasicDetails(BupaDTO basicDetails) {
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
	public CommunicationDTO getCommunications() {
		return communications;
	}
	/**
	 * @param communications the communications to set
	 */
	public void setCommunications(CommunicationDTO communications) {
		this.communications = communications;
	}
	/**
	 * @return the identifications
	 */
	public IdentificationDTO getIdentifications() {
		return identifications;
	}
	/**
	 * @param identifications the identifications to set
	 */
	public void setIdentifications(IdentificationDTO identifications) {
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SaveBupa [basicDetails=" + basicDetails + ", address=" + address + ", communications=" + communications
				+ ", identifications=" + identifications + ", payment=" + payment + "]";
	}
	
	

}

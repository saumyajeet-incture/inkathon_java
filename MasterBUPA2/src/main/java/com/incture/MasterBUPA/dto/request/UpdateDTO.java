package com.incture.MasterBUPA.dto.request;

import java.util.List;
import java.util.Set;

/**
 * @author ASHU
 * 
 *
 */
public class UpdateDTO {
	
	private int bpId;
	private  BupaDTO basicDetails;
	private Set<AddressDTO> address;
	private CommunicationDTO communications;
	private IdentificationDTO identifications;
	private Set<PaymentDTO> payment;
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
	public Set<AddressDTO> getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Set<AddressDTO> address) {
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
	public Set<PaymentDTO> getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(Set<PaymentDTO> payment) {
		this.payment = payment;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * @return the bpId
	 */
	public int getBpId() {
		return bpId;
	}
	/**
	 * @param bpId the bpId to set
	 */
	public void setBpId(int bpId) {
		this.bpId = bpId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UpdateDTO [bpId=" + bpId + ", basicDetails=" + basicDetails + ", address=" + address
				+ ", communications=" + communications + ", identifications=" + identifications + ", payment=" + payment
				+ "]";
	}
	
	

}

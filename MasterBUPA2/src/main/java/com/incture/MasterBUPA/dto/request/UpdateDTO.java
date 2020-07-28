package com.incture.MasterBUPA.dto.request;

import java.util.List;

public class UpdateDTO {
	private  Integer bpId;
	private List<AddressDTO> address;
	private CommunicationDTO communications;
	private IdentificationDTO identifications;
	private List<PaymentDTO> payment;
	/**
	 * @return the bpId
	 */
	public Integer getBpId() {
		return bpId;
	}
	/**
	 * @param bpId the bpId to set
	 */
	public void setBpId(Integer bpId) {
		this.bpId = bpId;
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
		return "UpdateDTO [bpId=" + bpId + ", address=" + address + ", communications=" + communications
				+ ", identifications=" + identifications + ", payment=" + payment + "]";
	}
	
}

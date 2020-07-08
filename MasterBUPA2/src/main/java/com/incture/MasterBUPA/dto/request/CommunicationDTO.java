package com.incture.MasterBUPA.dto.request;

public class CommunicationDTO {
	
	private String comments;
	private String email;
	private Long extAddress;
	private Long fax;
	private Long mobile;
	private String standCommMethod;
	private Long telephone;
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the extAddress
	 */
	public Long getExtAddress() {
		return extAddress;
	}
	/**
	 * @param extAddress the extAddress to set
	 */
	public void setExtAddress(Long extAddress) {
		this.extAddress = extAddress;
	}
	/**
	 * @return the fax
	 */
	public Long getFax() {
		return fax;
	}
	/**
	 * @param fax the fax to set
	 */
	public void setFax(Long fax) {
		this.fax = fax;
	}
	/**
	 * @return the mobile
	 */
	public Long getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the standCommMethod
	 */
	public String getStandCommMethod() {
		return standCommMethod;
	}
	/**
	 * @param standCommMethod the standCommMethod to set
	 */
	public void setStandCommMethod(String standCommMethod) {
		this.standCommMethod = standCommMethod;
	}
	/**
	 * @return the telephone
	 */
	public Long getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommunicationDTO [comments=" + comments + ", email=" + email + ", extAddress=" + extAddress + ", fax="
				+ fax + ", mobile=" + mobile + ", standCommMethod=" + standCommMethod + ", telephone=" + telephone
				+ "]";
	}
	
	
	

}

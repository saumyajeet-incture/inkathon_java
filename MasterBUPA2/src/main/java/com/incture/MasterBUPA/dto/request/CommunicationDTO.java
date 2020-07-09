package com.incture.MasterBUPA.dto.request;

public class CommunicationDTO {
	
	private String comments;
	private String email;
	private String extAddress;
	private String fax;
	private String mobile;
	private String standCommMethod;
	private String telephone;
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
	 * @return the extAddress
	 */
	public String getExtAddress() {
		return extAddress;
	}
	/**
	 * @param extAddress the extAddress to set
	 */
	public void setExtAddress(String extAddress) {
		this.extAddress = extAddress;
	}
	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
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

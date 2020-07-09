package com.incture.MasterBUPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ASHU
 *
 */
@Entity
public class CommunicationDetail{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer communicationId;	
	@Column(unique =true,nullable = false )
	private Integer bpId;
	private String comments;
	private String standCommMethod;
	private String extAddress;
	private String fax;
	private String mobile;
	private String email;
	private String telephone;
	/**
	 * @return the communicationId
	 */
	public Integer getCommunicationId() {
		return communicationId;
	}
	/**
	 * @param communicationId the communicationId to set
	 */
	public void setCommunicationId(Integer communicationId) {
		this.communicationId = communicationId;
	}
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
	@Override
	public String toString() {
		return "CommunicationDetail [communicationId=" + communicationId + ", bpId=" + bpId + ", comments=" + comments
				+ ", standCommMethod=" + standCommMethod + ", extAddress=" + extAddress + ", fax=" + fax + ", mobile="
				+ mobile + ", email=" + email + ", telephone=" + telephone + "]";
	}
}
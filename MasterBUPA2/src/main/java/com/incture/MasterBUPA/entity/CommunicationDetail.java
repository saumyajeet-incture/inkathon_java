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
	private Long extAddress;
	private Long fax;
	private Long mobile;
	private String email;
	private Long telephone;
	public Integer getCommunicationId() {
		return communicationId;
	}
	public void setCommunicationId(Integer communicationId) {
		this.communicationId = communicationId;
	}
	public Integer getBpId() {
		return bpId;
	}
	public void setBpId(Integer bpId) {
		this.bpId = bpId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getStandCommMethod() {
		return standCommMethod;
	}
	public void setStandCommMethod(String standCommMethod) {
		this.standCommMethod = standCommMethod;
	}
	public Long getExtAddress() {
		return extAddress;
	}
	public void setExtAddress(Long extAddress) {
		this.extAddress = extAddress;
	}
	public Long getFax() {
		return fax;
	}
	public void setFax(Long fax) {
		this.fax = fax;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "CommunicationDetail [communicationId=" + communicationId + ", bpId=" + bpId + ", comments=" + comments
				+ ", standCommMethod=" + standCommMethod + ", extAddress=" + extAddress + ", fax=" + fax + ", mobile="
				+ mobile + ", email=" + email + ", telephone=" + telephone + "]";
	}
}
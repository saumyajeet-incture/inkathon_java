package com.incture.BusinessPartner.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BasicInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bpId;
	private String firstName;
	private String lastName;
	private String bpRole;
	private String searchTerm1;
	private String searchTerm2;
	private String langKey;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the bpRole
	 */
	public String getBpRole() {
		return bpRole;
	}
	/**
	 * @param bpRole the bpRole to set
	 */
	public void setBpRole(String bpRole) {
		this.bpRole = bpRole;
	}
	/**
	 * @return the searchTerm1
	 */
	public String getSearchTerm1() {
		return searchTerm1;
	}
	/**
	 * @param searchTerm1 the searchTerm1 to set
	 */
	public void setSearchTerm1(String searchTerm1) {
		this.searchTerm1 = searchTerm1;
	}
	/**
	 * @return the searchTerm2
	 */
	public String getSearchTerm2() {
		return searchTerm2;
	}
	/**
	 * @param searchTerm2 the searchTerm2 to set
	 */
	public void setSearchTerm2(String searchTerm2) {
		this.searchTerm2 = searchTerm2;
	}
	/**
	 * @return the langKey
	 */
	public String getLangKey() {
		return langKey;
	}
	/**
	 * @param langKey the langKey to set
	 */
	public void setLangKey(String langKey) {
		this.langKey = langKey;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BasicInfo [bpId=" + bpId + ", firstName=" + firstName + ", lastName=" + lastName + ", bpRole=" + bpRole
				+ ", searchTerm1=" + searchTerm1 + ", searchTerm2=" + searchTerm2 + ", langKey=" + langKey + "]";
	}
	
	

}

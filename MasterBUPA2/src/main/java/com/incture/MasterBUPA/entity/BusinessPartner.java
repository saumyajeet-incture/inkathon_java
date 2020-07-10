package com.incture.MasterBUPA.entity;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.incture.MasterBUPA.config.CustomSequenceGenerator;

/**
 * @author SAUMYAJEET
 *
 */
@Entity
public class BusinessPartner {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bpId;
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
	   @GenericGenerator(
	            name = "role_seq", 
	            strategy = "com.incture.MasterBUPA.config.CustomSequenceGenerator.java", 
	            parameters = { 
	                    @Parameter(name = CustomSequenceGenerator.INCREMENT_PARAM, value = "50"),
	                    @Parameter(name = CustomSequenceGenerator.CODE_NUMBER_SEPARATOR_PARAMETER, value = "_"), 
	                    @Parameter(name =CustomSequenceGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")})
	private UUID roleId;
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
	 * @return the roleId
	 */
	public UUID getRoleId() {
		return roleId;
	}
	/**
	 * @param uuid the roleId to set
	 */
	public void setRoleId(UUID uuid) {
		this.roleId = uuid;
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
		return "BusinessPartner [bpId=" + bpId + ", roleId=" + roleId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", bpRole=" + bpRole + ", searchTerm1=" + searchTerm1 + ", searchTerm2=" + searchTerm2
				+ ", langKey=" + langKey + "]";
	}
}
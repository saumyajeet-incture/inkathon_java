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
public class Identification{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer identificationId;
	@Column(unique =true,nullable = false )
	private Integer bpId;
	private String userName;
	private Long personnelNo;
	private String birthPlace;
	private String countryOfOrigin;
	private String citizenship;
	private String employeer;
	private String maritalStatus;
	private String nationalityStatus;
	private String occupation;
	/**
	 * @return the identificationId
	 */
	public Integer getIdentificationId() {
		return identificationId;
	}
	/**
	 * @param identificationId the identificationId to set
	 */
	public void setIdentificationId(Integer identificationId) {
		this.identificationId = identificationId;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the personnelNo
	 */
	public Long getPersonnelNo() {
		return personnelNo;
	}
	/**
	 * @param personnelNo the personnelNo to set
	 */
	public void setPersonnelNo(Long personnelNo) {
		this.personnelNo = personnelNo;
	}
	/**
	 * @return the birthPlace
	 */
	public String getBirthPlace() {
		return birthPlace;
	}
	/**
	 * @param birthPlace the birthPlace to set
	 */
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	/**
	 * @return the citizenship
	 */
	public String getCitizenship() {
		return citizenship;
	}
	/**
	 * @param citizenship the citizenship to set
	 */
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	/**
	 * @return the employer
	 */
	public String getEmployeer() {
		return employeer;
	}
	/**
	 * @param employeer the employer to set
	 */
	public void setEmployeer(String employeer) {
		this.employeer = employeer;
	}
	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	/**
	 * @return the nationalityStatus
	 */
	public String getNationalityStatus() {
		return nationalityStatus;
	}
	/**
	 * @param nationalityStatus the nationalityStatus to set
	 */
	public void setNationalityStatus(String nationalityStatus) {
		this.nationalityStatus = nationalityStatus;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	@Override
	public String toString() {
		return "Identification [identificationId=" + identificationId + ", bpId=" + bpId + ", userName=" + userName
				+ ", personnelNo=" + personnelNo + ", birthPlace=" + birthPlace + ", countryOfOrigin=" + countryOfOrigin
				+ ", citizenship=" + citizenship + ", employeer=" + employeer + ", maritalStatus=" + maritalStatus
				+ ", nationalityStatus=" + nationalityStatus + ", occupation=" + occupation + "]";
	}
}
	
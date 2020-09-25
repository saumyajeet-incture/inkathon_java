package com.incture.MasterBUPA.dto.request;

public class IdentificationDTO {
	
	private String uname;
	private String personnelNo;
	private String birthPlace;
	private String countryOfOrigin;
	private String country;
	private String employer;
	private String maritalStatus;
	private String nationality;
	private String occupation;
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	/**
	 * @return the personnelNo
	 */
	public String getPersonnelNo() {
		return personnelNo;
	}
	/**
	 * @param personnelNo the personnelNo to set
	 */
	public void setPersonnelNo(String personnelNo) {
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the employer
	 */
	public String getEmployer() {
		return employer;
	}
	/**
	 * @param employer the employer to set
	 */
	public void setEmployer(String employer) {
		this.employer = employer;
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
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IdentificationDTO [uname=" + uname + ", personnelNo=" + personnelNo + ", birthPlace=" + birthPlace
				+ ", countryOfOrigin=" + countryOfOrigin + ", country=" + country + ", employer=" + employer
				+ ", maritalStatus=" + maritalStatus + ", nationality=" + nationality + ", occupation=" + occupation
				+ "]";
	}	
	
	

}

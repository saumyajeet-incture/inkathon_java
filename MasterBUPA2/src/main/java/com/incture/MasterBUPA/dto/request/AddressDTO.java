package com.incture.MasterBUPA.dto.request;

public class AddressDTO {
	private String city;
	private String country;
	private String email;
	private Long postalCode;
	private String street;
	private String street2;
	private String street4;
	private Long telephone;
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	 * @return the postalCode
	 */
	public Long getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}
	/**
	 * @param street2 the street2 to set
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	/**
	 * @return the street4
	 */
	public String getStreet4() {
		return street4;
	}
	/**
	 * @param street4 the street4 to set
	 */
	public void setStreet4(String street4) {
		this.street4 = street4;
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
		return "AddressDTO [city=" + city + ", country=" + country + ", email=" + email + ", postalCode=" + postalCode
				+ ", street=" + street + ", street2=" + street2 + ", street4=" + street4 + ", telephone=" + telephone
				+ "]";
	}
	
	

}

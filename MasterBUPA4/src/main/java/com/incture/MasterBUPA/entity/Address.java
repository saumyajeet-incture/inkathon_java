
package com.incture.MasterBUPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ASHU
 *
 */
@Entity
public class Address{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	
	
	private Integer bpId;
	private String street1;
	private String street2;
	private String street4;
	private String city;
	private String postalCode;
	private String country;
	private String email;
	private String telephone;
	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}
	/**
	 * @param street1 the street1 to set
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
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
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
		return "Address [addressId=" + addressId + ", bpId=" + bpId + ", street1=" + street1 + ", street2=" + street2
				+ ", street4=" + street4 + ", city=" + city + ", postalCode=" + postalCode + ", country=" + country
				+ ", email=" + email + ", telephone=" + telephone + "]";
	}
	
}
	
	

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
public class Country{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer country_id;
	@Column(unique =true,nullable = false,length =2 )
	private String country_code;
	@Column(unique =true,nullable = false)
	private String country_name;
	
	/**
	 * @return the country_id
	 */
	public Integer getCountry_id() {
		return country_id;
	}

	/**
	 * @param country_id the country_id to set
	 */
	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	/**
	 * @return the country_code
	 */
	public String getCountry_code() {
		return country_code;
	}

	/**
	 * @param country_code the country_code to set
	 */
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	/**
	 * @return the country_name
	 */
	public String getCountry_name() {
		return country_name;
	}

	/**
	 * @param country_name the country_name to set
	 */
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country_code=" + country_code + ", country_name=" + country_name
				+ "]";
	}
}
	
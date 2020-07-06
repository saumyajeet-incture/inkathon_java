
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
public class Gender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gender_id;
	@Column(unique =true,nullable = false)
	private String gender_name;
	/**
	 * @return the gender_id
	 */
	public Integer getGender_id() {
		return gender_id;
	}
	/**
	 * @param gender_id the gender_id to set
	 */
	public void setGender_id(Integer gender_id) {
		this.gender_id = gender_id;
	}
	/**
	 * @return the gender_name
	 */
	public String getGender_name() {
		return gender_name;
	}
	/**
	 * @param gender_name the gender_name to set
	 */
	public void setGender_name(String gender_name) {
		this.gender_name = gender_name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gender [gender_id=" + gender_id + ", gender_name=" + gender_name + "]";
	}
	
}
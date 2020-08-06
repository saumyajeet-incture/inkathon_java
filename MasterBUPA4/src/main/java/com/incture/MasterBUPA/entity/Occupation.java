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
public class Occupation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer occupation_id;
	@Column(unique =true,nullable = false)
	private String occupation_name;
	/**
	 * @return the occupation_id
	 */
	public Integer getOccupation_id() {
		return occupation_id;
	}
	/**
	 * @param occupation_id the occupation_id to set
	 */
	public void setOccupation_id(Integer occupation_id) {
		this.occupation_id = occupation_id;
	}
	/**
	 * @return the occupation_name
	 */
	public String getOccupation_name() {
		return occupation_name;
	}
	/**
	 * @param occupation_name the occupation_name to set
	 */
	public void setOccupation_name(String occupation_name) {
		this.occupation_name = occupation_name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Occupation [occupation_id=" + occupation_id + ", occupation_name=" + occupation_name + "]";
	}
}

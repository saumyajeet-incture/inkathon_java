
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
public class ReferenceDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reference_id;
	@Column(unique =true,nullable = false)
	private String reference_name;
	/**
	 * @return the reference_id
	 */
	public Integer getReference_id() {
		return reference_id;
	}
	/**
	 * @param reference_id the reference_id to set
	 */
	public void setReference_id(Integer reference_id) {
		this.reference_id = reference_id;
	}
	/**
	 * @return the reference_name
	 */
	public String getReference_name() {
		return reference_name;
	}
	/**
	 * @param reference_name the reference_name to set
	 */
	public void setReference_name(String reference_name) {
		this.reference_name = reference_name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReferenceDocument [reference_id=" + reference_id + ", reference_name=" + reference_name + "]";
	}
	
}
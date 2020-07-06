
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
public class StandCommMethod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer method_id;
	@Column(unique =true,nullable = false)
	private String method_name;
	/**
	 * @return the method_id
	 */
	public Integer getMethod_id() {
		return method_id;
	}
	/**
	 * @param method_id the method_id to set
	 */
	public void setMethod_id(Integer method_id) {
		this.method_id = method_id;
	}
	/**
	 * @return the method_name
	 */
	public String getMethod_name() {
		return method_name;
	}
	/**
	 * @param method_name the method_name to set
	 */
	public void setMethod_name(String method_name) {
		this.method_name = method_name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StandCommMethod [method_id=" + method_id + ", method_name=" + method_name + "]";
	}
}
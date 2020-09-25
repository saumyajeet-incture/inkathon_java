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
public class MaritalStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer status_id;
	@Column(unique =true,nullable = false)
	private String status_name;
	/**
	 * @return the status_id
	 */
	public Integer getStatus_id() {
		return status_id;
	}
	/**
	 * @param status_id the status_id to set
	 */
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}
	/**
	 * @return the status_name
	 */
	public String getStatus_name() {
		return status_name;
	}
	/**
	 * @param status_name the status_name to set
	 */
	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MaritalStatus [status_id=" + status_id + ", status_name=" + status_name + "]";
	}
}
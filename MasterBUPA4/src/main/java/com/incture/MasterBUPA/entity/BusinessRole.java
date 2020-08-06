package com.incture.MasterBUPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author SAUMYAJEET
 *
 */
@Entity
public class BusinessRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bp_id;
	
	@Column(unique =true,nullable = false)
	private String bp_name;

	public Integer getBp_id() {
		return bp_id;
	}

	public void setBp_id(Integer bp_id) {
		this.bp_id = bp_id;
	}

	public String getBp_name() {
		return bp_name;
	}

	public void setBp_name(String bp_name) {
		this.bp_name = bp_name;
	}

	@Override
	public String toString() {
		return "BusinessRole [bp_id=" + bp_id + ", bp_name=" + bp_name + "]";
	}
	
	

}

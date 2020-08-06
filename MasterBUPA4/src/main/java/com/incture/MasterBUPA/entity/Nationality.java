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
public class Nationality {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nationalityId;
	
	@Column(unique =true,nullable = false)
	private String nationalityname;

	public Integer getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(Integer nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getNationalityname() {
		return nationalityname;
	}

	public void setNationalityname(String nationalityname) {
		this.nationalityname = nationalityname;
	}

	@Override
	public String toString() {
		return "Nationality [nationalityId=" + nationalityId + ", nationalityname=" + nationalityname + "]";
	}
	
	

}

package com.incture.MasterBUPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchParameter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer searchParameterId;
	
	private String searchParameter;

	/**
	 * @return the searchParameterId
	 */
	public Integer getSearchParameterId() {
		return searchParameterId;
	}

	/**
	 * @param searchParameterId the searchParameterId to set
	 */
	public void setSearchParameterId(Integer searchParameterId) {
		this.searchParameterId = searchParameterId;
	}

	/**
	 * @return the searchParameter
	 */
	public String getSearchParameter() {
		return searchParameter;
	}

	/**
	 * @param searchParameter the searchParameter to set
	 */
	public void setSearchParameter(String searchParameter) {
		this.searchParameter = searchParameter;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SearchParameter [searchParameterId=" + searchParameterId + ", searchParameter=" + searchParameter + "]";
	}
	
	

}

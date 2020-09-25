package com.incture.MasterBUPA.dto.response;

import java.util.List;

import com.incture.MasterBUPA.entity.BusinessPartner;

public class PageResponse {
	
	private List<BusinessPartner> listBusinessPartner;
	int totalPage;
	/**
	 * @return the listBusinessPartner
	 */
	public List<BusinessPartner> getListBusinessPartner() {
		return listBusinessPartner;
	}
	/**
	 * @param listBusinessPartner the listBusinessPartner to set
	 */
	public void setListBusinessPartner(List<BusinessPartner> listBusinessPartner) {
		this.listBusinessPartner = listBusinessPartner;
	}
	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PageResponse [listBusinessPartner=" + listBusinessPartner + ", totalPage=" + totalPage + "]";
	}
	

}

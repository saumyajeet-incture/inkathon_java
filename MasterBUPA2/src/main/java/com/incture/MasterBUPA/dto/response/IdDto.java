package com.incture.MasterBUPA.dto.response;

public class IdDto {
	
	private Integer bp_id;
	private Integer role_id;
	private boolean status;
	/**
	 * @return the bp_id
	 */
	public Integer getBp_id() {
		return bp_id;
	}
	/**
	 * @param bp_id the bp_id to set
	 */
	public void setBp_id(Integer bp_id) {
		this.bp_id = bp_id;
	}
	/**
	 * @return the role_id
	 */
	public Integer getRole_id() {
		return role_id;
	}
	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	
	
	
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IdDto [bp_id=" + bp_id + ", role_id=" + role_id + ", status=" + status + "]";
	}
	
	

}

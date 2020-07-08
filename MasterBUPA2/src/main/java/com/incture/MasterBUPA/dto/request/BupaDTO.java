package com.incture.MasterBUPA.dto.request;

public class BupaDTO {
	
	private String fname;
	private String lname;
	private String sLanguage;
	private String sRole;
	private String sTerm1;
	private String sTerm2;
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the sLanguage
	 */
	public String getsLanguage() {
		return sLanguage;
	}
	/**
	 * @param sLanguage the sLanguage to set
	 */
	public void setsLanguage(String sLanguage) {
		this.sLanguage = sLanguage;
	}
	/**
	 * @return the sRole
	 */
	public String getsRole() {
		return sRole;
	}
	/**
	 * @param sRole the sRole to set
	 */
	public void setsRole(String sRole) {
		this.sRole = sRole;
	}
	/**
	 * @return the sTerm1
	 */
	public String getsTerm1() {
		return sTerm1;
	}
	/**
	 * @param sTerm1 the sTerm1 to set
	 */
	public void setsTerm1(String sTerm1) {
		this.sTerm1 = sTerm1;
	}
	/**
	 * @return the sTerm2
	 */
	public String getsTerm2() {
		return sTerm2;
	}
	/**
	 * @param sTerm2 the sTerm2 to set
	 */
	public void setsTerm2(String sTerm2) {
		this.sTerm2 = sTerm2;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BupaDTO [fname=" + fname + ", lname=" + lname + ", sLanguage=" + sLanguage + ", sRole=" + sRole
				+ ", sTerm1=" + sTerm1 + ", sTerm2=" + sTerm2 + "]";
	}
	
	

}

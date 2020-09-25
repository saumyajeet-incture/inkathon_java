package com.incture.MasterBUPA.dto.request;

public class PaymentDTO {

	private String id;
	private String pCity;
	private String bankKey;
	private String bankAcct;
	private String controlKey;
	private String refDoc;
	private String iban;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the pCity
	 */
	public String getpCity() {
		return pCity;
	}
	/**
	 * @param pCity the pCity to set
	 */
	public void setpCity(String pCity) {
		this.pCity = pCity;
	}
	/**
	 * @return the bankKey
	 */
	public String getBankKey() {
		return bankKey;
	}
	/**
	 * @param bankKey the bankKey to set
	 */
	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}
	/**
	 * @return the bankAcct
	 */
	public String getBankAcct() {
		return bankAcct;
	}
	/**
	 * @param bankAcct the bankAcct to set
	 */
	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}
	/**
	 * @return the controlKey
	 */
	public String getControlKey() {
		return controlKey;
	}
	/**
	 * @param controlKey the controlKey to set
	 */
	public void setControlKey(String controlKey) {
		this.controlKey = controlKey;
	}
	/**
	 * @return the refDoc
	 */
	public String getRefDoc() {
		return refDoc;
	}
	/**
	 * @param refDoc the refDoc to set
	 */
	public void setRefDoc(String refDoc) {
		this.refDoc = refDoc;
	}
	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}
	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentDTO [id=" + id + ", pCity=" + pCity + ", bankKey=" + bankKey + ", bankAcct=" + bankAcct
				+ ", controlKey=" + controlKey + ", refDoc=" + refDoc + ", iban=" + iban + "]";
	}
	
	
}

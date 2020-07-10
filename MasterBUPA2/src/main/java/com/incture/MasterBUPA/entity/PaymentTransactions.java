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
public class PaymentTransactions{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	
	private Integer bpId;
	private String paymentCity;
	private String bankKey;
	private String bankAccount;
	private String controlKey;
	private String referenceDocument;
	private String iBAN;
	/**
	 * @return the paymentId
	 */
	public Integer getPaymentId() {
		return paymentId;
	}
	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	/**
	 * @return the bpId
	 */
	public Integer getBpId() {
		return bpId;
	}
	/**
	 * @param bpId the bpId to set
	 */
	public void setBpId(Integer bpId) {
		this.bpId = bpId;
	}
	/**
	 * @return the paymentCity
	 */
	public String getPaymentCity() {
		return paymentCity;
	}
	/**
	 * @param paymentCity the paymentCity to set
	 */
	public void setPaymentCity(String paymentCity) {
		this.paymentCity = paymentCity;
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
	 * @return the bankAccount
	 */
	public String getBankAccount() {
		return bankAccount;
	}
	/**
	 * @param bankAccount the bankAccount to set
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
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
	 * @return the referenceDocument
	 */
	public String getReferenceDocument() {
		return referenceDocument;
	}
	/**
	 * @param referenceDocument the referenceDocument to set
	 */
	public void setReferenceDocument(String referenceDocument) {
		this.referenceDocument = referenceDocument;
	}
	/**
	 * @return the iBAN
	 */
	public String getiBAN() {
		return iBAN;
	}
	/**
	 * @param iBAN the iBAN to set
	 */
	public void setiBAN(String iBAN) {
		this.iBAN = iBAN;
	}
	@Override
	public String toString() {
		return "PaymentTransactions [paymentId=" + paymentId + ", bpId=" + bpId + ", paymentCity=" + paymentCity
				+ ", bankKey=" + bankKey + ", bankAccount=" + bankAccount + ", controlKey=" + controlKey
				+ ", referenceDocument=" + referenceDocument + ", iBAN=" + iBAN + "]";
	}
}
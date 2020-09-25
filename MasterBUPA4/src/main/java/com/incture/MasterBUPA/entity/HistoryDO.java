package com.incture.MasterBUPA.entity;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class HistoryDO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int historyId;
	
	public int bpId;
	
	public String historyData;
	
	
	public String date;
	
	public int version;

	/**
	 * @return the historyId
	 */
	public int getHistoryId() {
		return historyId;
	}

	/**
	 * @param historyId the historyId to set
	 */
	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	/**
	 * @return the bpId
	 */
	public int getBpId() {
		return bpId;
	}

	/**
	 * @param bpId the bpId to set
	 */
	public void setBpId(int bpId) {
		this.bpId = bpId;
	}

	

	/**
	 * @return the historyData
	 */
	
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the historyData
	 */
	public String getHistoryData() {
		return historyData;
	}

	/**
	 * @param historyData the historyData to set
	 */
	public void setHistoryData(String historyData) {
		this.historyData = historyData;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate() {
		
		LocalDateTime localDateTime=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		this.date = localDateTime.toString();
	}

	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HistoryDO [historyId=" + historyId + ", bpId=" + bpId + ", historyData=" + historyData + ", date="
				+ date + ", version=" + version + ", getHistoryId()=" + getHistoryId() + ", getBpId()=" + getBpId()
				+ ", getHistoryData()=" + getHistoryData() + ", getDate()=" + getDate() + ", getVersion()="
				+ getVersion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	

}
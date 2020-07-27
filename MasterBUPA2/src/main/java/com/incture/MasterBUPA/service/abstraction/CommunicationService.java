package com.incture.MasterBUPA.service.abstraction;

import java.util.List;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.CommunicationDetail;

@Service
public interface CommunicationService {
	public void save(CommunicationDetail commDetail);
	
	public List<CommunicationDetail> getCommunication();
	
	public CommunicationDetail getCommunicationById(int id);
	
}

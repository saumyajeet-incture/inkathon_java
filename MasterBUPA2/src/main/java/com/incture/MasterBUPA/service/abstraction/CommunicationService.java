package com.incture.MasterBUPA.service.abstraction;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.CommunicationDetail;

@Service
public interface CommunicationService {
	public void save(CommunicationDetail commDetail);
}

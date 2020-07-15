package com.incture.BusinessPartner.service;

import org.springframework.stereotype.Service;

import com.incture.BusinessPartner.entity.BasicInfo;

@Service
public interface BusinessService {
	
	public void save(BasicInfo basicInfo);

}

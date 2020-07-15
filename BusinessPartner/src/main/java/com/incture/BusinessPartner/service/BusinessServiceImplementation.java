package com.incture.BusinessPartner.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.incture.BusinessPartner.dao.BusinessDAO;
import com.incture.BusinessPartner.entity.BasicInfo;

public class BusinessServiceImplementation implements BusinessService{
	
	@Autowired
	private BusinessDAO businessDAO;

	@Override
	public void save(BasicInfo basicInfo) {
		// TODO Auto-generated method stub
		businessDAO.save(basicInfo);
		
	}

}

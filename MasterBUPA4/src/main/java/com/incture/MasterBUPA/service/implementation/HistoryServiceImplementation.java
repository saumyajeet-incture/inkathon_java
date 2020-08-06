package com.incture.MasterBUPA.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.HistoryRepository;
import com.incture.MasterBUPA.entity.HistoryDO;
import com.incture.MasterBUPA.service.abstraction.HistoryService;

@Service
public class HistoryServiceImplementation implements HistoryService {
	
	@Autowired
	private HistoryRepository historyRepository;

	@Override
	public void save(HistoryDO historyDO) {
		// TODO Auto-generated method stub
		 historyRepository.save(historyDO);
	}

	@Override
	public int findVersion(int bpId) {
		// TODO Auto-generated method stub
		
		int version;
		try {
			version = historyRepository.findVersion(bpId);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			return 0;
			
		}
		
		return version;
	}

}



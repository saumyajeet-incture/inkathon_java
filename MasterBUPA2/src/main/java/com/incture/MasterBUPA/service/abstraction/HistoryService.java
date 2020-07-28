package com.incture.MasterBUPA.service.abstraction;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.HistoryDO;

@Service
public interface HistoryService {

	public void save(HistoryDO historyDO);

}

package com.incture.MasterBUPA.service.abstraction;



import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.response.DisplayResponse;

@Service
public interface DisplayService {
	
	public DisplayResponse findEachData(int bpId);

}

package com.incture.MasterBUPA.service.abstraction;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.request.UpdateDTO;
import com.incture.MasterBUPA.dto.response.IdDto;

@Service
public interface UpdateService {
	
	public IdDto update(UpdateDTO updateDTO);

}

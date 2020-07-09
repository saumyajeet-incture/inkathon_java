package com.incture.MasterBUPA.service.abstraction;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.request.SaveBupa;

@Service
public interface MainBupaService {
	
	public void save(SaveBupa saveBupa);

}

package com.incture.MasterBUPA.service.abstraction;

import java.util.List;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.request.SaveBupa;
import com.incture.MasterBUPA.dto.response.IdDto;

@Service
public interface MainBupaService {
	
	public IdDto save(SaveBupa saveBupa);

}

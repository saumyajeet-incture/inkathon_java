package com.incture.MasterBUPA.service.abstraction;



import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.response.PageResponse;
import com.incture.MasterBUPA.dto.response.SaveBupaResponse;

@Service
public interface DisplayService {
	
	public SaveBupaResponse findEachData(int bpId);
	
	public PageResponse findEachDatabyRoleId(int roleId);
	
//	public List<DisplayResponse> findEachDatabyFirstName(String firstName);
//	
//	public List<DisplayResponse> findEachDatabyLastName(String lastName);

	public PageResponse findDataByBpId(int bpId);
}

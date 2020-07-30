package com.incture.MasterBUPA.service.abstraction;



import java.util.List;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.response.DisplayResponse;

@Service
public interface DisplayService {
	
	public DisplayResponse findEachData(int bpId);
	
	public DisplayResponse findEachDatabyRoleId(int roleId);
	
	public List<DisplayResponse> findEachDatabyFirstName(String firstName);
	
	public List<DisplayResponse> findEachDatabyLastName(String lastName);
	
	public List<DisplayResponse> findEachDatabyRole(String role);

}

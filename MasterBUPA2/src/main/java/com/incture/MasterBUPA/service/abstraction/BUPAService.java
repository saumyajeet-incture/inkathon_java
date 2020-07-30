package com.incture.MasterBUPA.service.abstraction;

import java.util.List;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dto.response.DisplayResponse;
import com.incture.MasterBUPA.dto.response.PageResponse;
import com.incture.MasterBUPA.entity.BusinessPartner;
import org.springframework.data.domain.Sort;

/**
 * @author SAUMYAJEET
 *
 */

@Service
public interface BUPAService {
	
	public BusinessPartner save(BusinessPartner businessPartner);
	
	public Integer findRoleId(String bpRole);
	
	public List<Object[]> checkIfExists(String bp_role, String first_name, String lang_key, String last_name, String search_term1, String search_term2);
	
	public List<BusinessPartner> getAllBusinessPartner();
	
	public BusinessPartner findByBpId(int bpId);
	
	public PageResponse findBpByPage(Integer pno,Integer psize,String sortParam);
	
	public BusinessPartner findByRoleId(int rolId);
	
	public List<Object[]> findByFirstName(String firstName);
	
	public List<Object[]> findByLastName(String lastName);
	
	public List<Object[]> findByRole(String role);

}

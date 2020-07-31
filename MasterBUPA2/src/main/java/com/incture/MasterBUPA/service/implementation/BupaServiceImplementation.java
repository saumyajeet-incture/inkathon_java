package com.incture.MasterBUPA.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.BUPARepository;
import com.incture.MasterBUPA.dto.response.DisplayResponse;
import com.incture.MasterBUPA.dto.response.PageResponse;
import com.incture.MasterBUPA.entity.BusinessPartner;
import com.incture.MasterBUPA.service.abstraction.BUPAService;

/**
 * @author SAUMYAJEET
 *
 */

@Service
public class BupaServiceImplementation implements BUPAService {
	
	@Autowired
	private BUPARepository bupaRepository;
	List<Object[]> findByRoleId;
	
	//==========SAVE BUSINESS PARTNER============

	@Override
	public BusinessPartner save(BusinessPartner businessPartner) {
		// TODO Auto-generated method stub
		return bupaRepository.save(businessPartner);
		
	}
	
	//=============FINDING MAXIMUM ROLE ID TILL NOW==========

	@Override
	public Integer findRoleId(String bpRole) {
		// TODO Auto-generated method stub
		return bupaRepository.findRoleId(bpRole);
	}
	
	//===============CHECK IF ALREADY EXIST SAME DATA IN DB=================

	@Override
	public List<Object[]> checkIfExists(String bp_role, String first_name, String lang_key, String last_name,
			String search_term1, String search_term2) {
		// TODO Auto-generated method stub
		
		return bupaRepository.checkIfExists(bp_role, first_name, lang_key, last_name, search_term1, search_term2);
	}
	
	//============GET ALL BUSINESS PARTNER======

	@Override
	public List<BusinessPartner> getAllBusinessPartner() {
		// TODO Auto-generated method stub
		return bupaRepository.findAll();
	}
	
	//===========FIND BY BP ID=============

	@Override
	public BusinessPartner findByBpId(int bpId) {
		// TODO Auto-generated method stub
		Optional<BusinessPartner> result=bupaRepository.findById(bpId);
		if(result.isPresent()==false){
			return null;
		}
		return result.get();
	}
	
	//=================PAGINATION===========

	@Override
	public PageResponse findBpByPage(Integer pno, Integer psize, String sortParam, String orderBy) {
		// TODO Auto-generated method stub

		PageResponse pageResponse = new PageResponse();

		if (orderBy.equals("Descending")) {
			Pageable pageable = PageRequest.of(pno, psize, Sort.by(sortParam).descending());
			Page<BusinessPartner> pagedResult = bupaRepository.findAll(pageable);

			System.out.println(" pages in descending " + pagedResult.getTotalPages());

			pageResponse.setListBusinessPartner(pagedResult.getContent());
			pageResponse.setTotalPage(pagedResult.getTotalPages());

			return pageResponse;
		}
		else{
			
			Pageable pageable = PageRequest.of(pno, psize, Sort.by(sortParam).ascending());
			Page<BusinessPartner> pagedResult = bupaRepository.findAll(pageable);

			System.out.println(" pages in ascending " + pagedResult.getTotalPages());

			pageResponse.setListBusinessPartner(pagedResult.getContent());
			pageResponse.setTotalPage(pagedResult.getTotalPages());

			return pageResponse;
			
		}

	}
	
	//=================FIND BY ROLE ID===========

	@Override
	public BusinessPartner findByRoleId(int rolId) {
		// TODO Auto-generated method stub
		BusinessPartner businessPartner = new BusinessPartner();
		// System.out.println(findByRoleId.get(0).toString());
		findByRoleId = bupaRepository.getBasicDetailsByRoleId(rolId);

		if (findByRoleId.isEmpty()) {
			
			return null;

		}
		System.out.println(findByRoleId.get(0).toString());
		businessPartner.setBpId( (Integer) findByRoleId.get(0)[6]);
		businessPartner.setBpRole((String) findByRoleId.get(0)[0]);
		businessPartner.setFirstName((String) findByRoleId.get(0)[1]);
		businessPartner.setLastName((String) findByRoleId.get(0)[3]);
		businessPartner.setSearchTerm1((String) findByRoleId.get(0)[4]);
		businessPartner.setSearchTerm2((String) findByRoleId.get(0)[5]);
		businessPartner.setRoleId(rolId);
		businessPartner.setLangKey((String) findByRoleId.get(0)[2]);
		return businessPartner;
	}
	
	//===============FIND BY FIRST NAME===========

	@Override
	public List<Object[]> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		List<Object[]> findByFirstName=bupaRepository.getBasicDetailsByFirstName(firstName);
		
		return findByFirstName;
	}

	
	//===============FIND BY LAST NAME===========
	
	@Override
	public List<Object[]> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		List<Object[]> findByLastName=bupaRepository.getBasicDetailsByLastName(lastName);
		return findByLastName;
	}

	
	
	//==============FIND BY CUSTOMER/VENDOR========
	
	@Override
	public List<Object[]> findByRole(String role) {
		// TODO Auto-generated method stub
		List<Object[]> findByRole=bupaRepository.getBasicDetailsByRole(role);
		return findByRole;
	}


}

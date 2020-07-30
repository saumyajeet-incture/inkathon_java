package com.incture.MasterBUPA.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.BUPARepository;
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

	@Override
	public BusinessPartner save(BusinessPartner businessPartner) {
		// TODO Auto-generated method stub
		return bupaRepository.save(businessPartner);
		
	}

	@Override
	public Integer findRoleId(String bpRole) {
		// TODO Auto-generated method stub
		return bupaRepository.findRoleId(bpRole);
	}

	@Override
	public List<Object[]> checkIfExists(String bp_role, String first_name, String lang_key, String last_name,
			String search_term1, String search_term2) {
		// TODO Auto-generated method stub
		
		return bupaRepository.checkIfExists(bp_role, first_name, lang_key, last_name, search_term1, search_term2);
	}

	@Override
	public List<BusinessPartner> getAllBusinessPartner() {
		// TODO Auto-generated method stub
		return bupaRepository.findAll();
	}

	@Override
	public BusinessPartner findByBpId(int bpId) {
		// TODO Auto-generated method stub
		Optional<BusinessPartner> result=bupaRepository.findById(bpId);
		return result.get();
	}

	@Override
	public PageResponse findBpByPage(Integer pno, Integer psize,String sortParam) {
		// TODO Auto-generated method stub
//		PageRequest paging= PageRequest.of(pno, psize);
		
//		Pageable pageable=PageRequest.of(pno, psize, Sort.Direction.ASC, sortParam);
		
		PageResponse pageResponse=new PageResponse();
		
		Pageable pageable=PageRequest.of(pno, psize, Sort.by(sortParam));
		Page<BusinessPartner> pagedResult=bupaRepository.findAll(pageable);
		
		System.out.println(" pages "+pagedResult.getTotalPages());
		
		pageResponse.setListBusinessPartner(pagedResult.getContent());
		pageResponse.setTotalPage(pagedResult.getTotalPages());
		
		return pageResponse;
		
	}
	


}

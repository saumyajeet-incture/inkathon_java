package com.incture.MasterBUPA.dao.bupa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.MasterBUPA.entity.BusinessPartner;

public interface BUPARepository extends JpaRepository<BusinessPartner,Integer> {
	
	@Query(value="SELECT max(ROLE_ID) from BUSINESS_PARTNER where BP_ROLE = ?1", nativeQuery = true)
	Integer findRoleId(String bpRole);

}

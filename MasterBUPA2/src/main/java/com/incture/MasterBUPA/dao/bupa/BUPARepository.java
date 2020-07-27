package com.incture.MasterBUPA.dao.bupa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.MasterBUPA.entity.BusinessPartner;

public interface BUPARepository extends JpaRepository<BusinessPartner,Integer> {
	
	@Query(value="SELECT max(ROLE_ID) from BUSINESS_PARTNER where BP_ROLE = ?1", nativeQuery = true)
	Integer findRoleId(String bpRole);
	
//	@Query(value="SELECT BP_ID,ROLE_ID from BUSINESS_PARTNER where LOWER(BP_ROLE) LIKE LOWER(?1) AND LOWER(FIRST_NAME) LIKE LOWER(?2) AND LOWER"
//			+ "(LANG_KEY) LIKE LOWER(?3) AND LOWER(LAST_NAME) LIKE LOWER(?4)  AND LOWER(SEARCH_TERM1) LIKE LOWER(?5)  AND LOWER(SEARCH_TERM2) LIKE LOWER(?6)", nativeQuery=true);
	
//	@Query(value="SELECT BP_ID,ROLE_ID from BUSINESS_PARTNER where LOWER(BP_ROLE) LIKE LOWER(:bp_role) AND LOWER(FIRST_NAME) LIKE LOWER(:first_name) AND LOWER (LANG_KEY) LIKE LOWER(:lang_key) AND LOWER(LAST_NAME) LIKE LOWER(:last_name)  AND LOWER(SEARCH_TERM1) LIKE LOWER(:search_term1)  AND LOWER(SEARCH_TERM2) LIKE LOWER(:search_term2)", nativeQuery=true);
	
//	@Query(value="SELECT BP_ID,ROLE_ID from BUSINESS_PARTNER where BP_ROLE=?1 AND FIRST_NAME=?2 AND LANG_KEY=?3 AND LAST_NAME=?4 AND SEARCH_TERM1=?5 AND SEARCH_TERM2=?6",nativeQuery=true)
	
	String query1="SELECT BUSINESS_PARTNER.ROLE_ID, BUSINESS_PARTNER.BP_ID from BUSINESS_PARTNER where LOWER(BP_ROLE) LIKE LOWER(?1) AND LOWER(FIRST_NAME) LIKE LOWER(?2) AND LOWER"
			+ "(LANG_KEY) LIKE LOWER(?3) AND LOWER(LAST_NAME) LIKE LOWER(?4)  AND LOWER(SEARCH_TERM1) LIKE LOWER(?5)  AND LOWER(SEARCH_TERM2) LIKE LOWER(?6)";
	
	@Query(value=query1, nativeQuery=true)
	List<Object[]> checkIfExists(String bp_role,String first_name, String lang_key,String last_name,String search_term1,String search_term2);
	
	

}

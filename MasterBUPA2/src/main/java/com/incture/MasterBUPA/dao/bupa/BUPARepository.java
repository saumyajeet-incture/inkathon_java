package com.incture.MasterBUPA.dao.bupa;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.MasterBUPA.entity.BusinessPartner;

public interface BUPARepository extends JpaRepository<BusinessPartner, Integer> {

	@Query(value = "SELECT max(ROLE_ID) from BUSINESS_PARTNER where BP_ROLE = ?1", nativeQuery = true)
	Integer findRoleId(String bpRole);

	String query1 = "SELECT BUSINESS_PARTNER.ROLE_ID, BUSINESS_PARTNER.BP_ID from BUSINESS_PARTNER where LOWER(BP_ROLE) LIKE LOWER(?1) AND LOWER(FIRST_NAME) LIKE LOWER(?2) AND LOWER"
			+ "(LANG_KEY) LIKE LOWER(?3) AND LOWER(LAST_NAME) LIKE LOWER(?4)  AND LOWER(SEARCH_TERM1) LIKE LOWER(?5)  AND LOWER(SEARCH_TERM2) LIKE LOWER(?6)";

	@Query(value = query1, nativeQuery = true)
	List<Object[]> checkIfExists(String bp_role, String first_name, String lang_key, String last_name,
			String search_term1, String search_term2);

	String query2 = "SELECT BP_ROLE,FIRST_NAME,LANG_KEY,LAST_NAME,SEARCH_TERM1,SEARCH_TERM2 from BUSINESS_PARTNER where BP_ID=?1";

	@Query(value = query2, nativeQuery = true)
	List<Object[]> getBasicDetails(int bp_id);
	
	String query3= "SELECT BP_ROLE,FIRST_NAME,LANG_KEY,LAST_NAME,SEARCH_TERM1,SEARCH_TERM2,BP_ID from BUSINESS_PARTNER where ROLE_ID=?1";
	@Query(value = query3, nativeQuery = true)
	List<Object[]> getBasicDetailsByRoleId(int role_id);
	
	String query4="SELECT * from BUSINESS_PARTNER where FIRST_NAME=?1";
	@Query(value = query4, nativeQuery = true)
	Page<BusinessPartner> getBasicDetailsByFirstName(String firstName,Pageable pageable);
	
	String query5="SELECT * from BUSINESS_PARTNER where LAST_NAME=?1";
	@Query(value = query5, nativeQuery = true)
	Page<BusinessPartner> getBasicDetailsByLastName(String lastName, Pageable pageable);
	
	String query6="SELECT * from BUSINESS_PARTNER where BP_ROLE=?1";
	@Query(value = query6, nativeQuery = true)
	Page<BusinessPartner> getBasicDetailsByRole(String bpRole, Pageable pageable);
	
}

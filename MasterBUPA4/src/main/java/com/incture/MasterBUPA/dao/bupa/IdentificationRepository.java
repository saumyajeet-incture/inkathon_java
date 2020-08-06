package com.incture.MasterBUPA.dao.bupa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.MasterBUPA.entity.Identification;

public interface IdentificationRepository extends JpaRepository<Identification,Integer> {
	
	
String query="select * from IDENTIFICATION where BP_ID = ?1";
	
	@Query(value=query,nativeQuery=true)
	List<Object[]> findDetail(int id);

	String query1="select BIRTH_PLACE,CITIZENSHIP,COUNTRY_OF_ORIGIN,EMPLOYEER,MARITAL_STATUS,NATIONALITY_STATUS,OCCUPATION,PERSONNEL_NO,USER_NAME FROM IDENTIFICATION where BP_ID = ?1";
	@Query(value=query1, nativeQuery=true)
	List<Object[]> getIdentificationDetails(int id);
	
	String query2="select IDENTIFICATION_ID FROM IDENTIFICATION where BP_ID=?1";
	@Query(value=query2,nativeQuery=true)
	Integer getIdentificationIdbyBpid(int id);
}


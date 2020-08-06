package com.incture.MasterBUPA.dao.bupa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.MasterBUPA.entity.HistoryDO;



public interface HistoryRepository extends JpaRepository<HistoryDO,Integer>{
	
	@Query(value = "SELECT max(VERSION) from HISTORYDO where BP_ID = ?1", nativeQuery = true)
	Integer findVersion(Integer bpId);

}
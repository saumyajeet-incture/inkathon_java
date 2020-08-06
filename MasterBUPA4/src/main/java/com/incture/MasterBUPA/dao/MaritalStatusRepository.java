package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.MasterBUPA.entity.MaritalStatus;



/**
 * @author ASHU
 *
 */
@Repository
public interface MaritalStatusRepository extends JpaRepository<MaritalStatus, Integer> {
	


}
package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.MasterBUPA.entity.Gender;



/**
 * @author ASHU
 *
 */
@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {
	


}
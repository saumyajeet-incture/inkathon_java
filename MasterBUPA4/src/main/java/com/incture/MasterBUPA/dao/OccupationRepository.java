package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.MasterBUPA.entity.Occupation;

 
/**
 * @author ASHU
 *
 */
@Repository
public interface OccupationRepository extends JpaRepository<Occupation, Integer> {
	


}
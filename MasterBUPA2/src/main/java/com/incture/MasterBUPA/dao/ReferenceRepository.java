package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.MasterBUPA.entity.ReferenceDocument;



/**
 * @author ASHU
 *
 */
@Repository
public interface ReferenceRepository extends JpaRepository<ReferenceDocument, Integer> {
	


}
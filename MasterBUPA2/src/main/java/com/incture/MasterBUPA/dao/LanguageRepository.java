package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.MasterBUPA.entity.Language;



/**
 * @author Soumyajeet
 *
 */
@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
	


}
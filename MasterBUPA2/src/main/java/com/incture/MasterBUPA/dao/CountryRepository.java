package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incture.MasterBUPA.entity.Country;



public interface CountryRepository extends JpaRepository<Country, Integer> {
	


}
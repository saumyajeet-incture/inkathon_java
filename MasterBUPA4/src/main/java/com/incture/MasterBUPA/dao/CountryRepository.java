package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.MasterBUPA.entity.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	


}
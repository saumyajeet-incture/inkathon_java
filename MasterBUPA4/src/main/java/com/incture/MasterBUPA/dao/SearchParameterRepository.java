package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.incture.MasterBUPA.entity.SearchParameter;


@Repository
public interface SearchParameterRepository extends JpaRepository<SearchParameter, Integer> {
	


}
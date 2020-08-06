package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.MasterBUPA.entity.Nationality;

/**
 * @author saumyajeet
 *
 */
@Repository
public interface NationalityRepository extends JpaRepository<Nationality,Integer>{

}

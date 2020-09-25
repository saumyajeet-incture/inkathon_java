package com.incture.BusinessPartner.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incture.BusinessPartner.entity.BasicInfo;




public interface BusinessDAO extends JpaRepository<BasicInfo,Integer> {

}

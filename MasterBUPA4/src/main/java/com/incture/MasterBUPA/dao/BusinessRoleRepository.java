package com.incture.MasterBUPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.MasterBUPA.entity.BusinessRole;

@Repository
public interface BusinessRoleRepository extends JpaRepository<BusinessRole,Integer> {

}

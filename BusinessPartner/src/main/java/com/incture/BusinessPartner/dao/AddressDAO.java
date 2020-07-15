package com.incture.BusinessPartner.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incture.BusinessPartner.entity.Address;

public interface AddressDAO extends JpaRepository<Address, Integer> {

}

package com.incture.MasterBUPA.dao.bupa;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.MasterBUPA.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {
	
	String query="select * from ADDRESS where ADDRESS.BP_ID = ?1";
	
	@Query(value=query,nativeQuery=true)
	List<Object[]> findDetail(int id);
	
	String query1="select CITY,COUNTRY,EMAIL,POSTAL_CODE,STREET1,STREET2,STREET4,TELEPHONE from ADDRESS WHERE BP_ID=?1";
	@Query(value=query1,nativeQuery=true)
	Set<Object[]> getAddressDetail(int id);

	String query3="select ADDRESS_ID from ADDRESS where BP_ID=?1";
	@Query(value=query3,nativeQuery=true)
	List<Integer> findBpList(int id);
}

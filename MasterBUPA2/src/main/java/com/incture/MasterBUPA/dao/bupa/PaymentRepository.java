package com.incture.MasterBUPA.dao.bupa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.MasterBUPA.entity.PaymentTransactions;

public interface PaymentRepository extends JpaRepository<PaymentTransactions,Integer> {
	
String query="select * from PAYMENT_TRANSACTIONS where BP_ID = ?1";
	
	@Query(value=query,nativeQuery=true)
	List<Object[]> findDetail(int id);

}

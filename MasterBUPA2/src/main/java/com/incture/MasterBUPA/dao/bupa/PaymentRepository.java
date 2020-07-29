package com.incture.MasterBUPA.dao.bupa;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.MasterBUPA.entity.PaymentTransactions;

public interface PaymentRepository extends JpaRepository<PaymentTransactions,Integer> {
	
String query="select * from PAYMENT_TRANSACTIONS where BP_ID = ?1";
	
	@Query(value=query,nativeQuery=true)
	List<Object[]> findDetail(int id);
	
	String query1="select BANK_ACCOUNT,BANK_KEY,CONTROL_KEY,IBAN,PAYMENT_CITY,REFERENCE_DOCUMENT,TRANSACTIONID from PAYMENT_TRANSACTIONS WHERE BP_ID=?1";
	@Query(value=query1,nativeQuery=true)
	Set<Object[]> getPaymentsDetail(int id);

}

package com.incture.MasterBUPA.dao.bupa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incture.MasterBUPA.entity.PaymentTransactions;

public interface PaymentRepository extends JpaRepository<PaymentTransactions,Integer> {

}

package com.incture.MasterBUPA.service.abstraction;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.PaymentTransactions;

@Service
public interface PaymentTransactionService {
	
	public void save(PaymentTransactions paymentTransactions);

}

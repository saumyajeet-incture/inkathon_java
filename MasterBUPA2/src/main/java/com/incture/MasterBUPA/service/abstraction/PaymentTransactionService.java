package com.incture.MasterBUPA.service.abstraction;

import java.util.List;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.PaymentTransactions;

@Service
public interface PaymentTransactionService {
	
	public void save(PaymentTransactions paymentTransactions);
	
	public List<PaymentTransactions> findPaymentTransactions();
	
	public List<PaymentTransactions> findPaymentTransactionsById(int id);

}

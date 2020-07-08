package com.incture.MasterBUPA.service.implementation;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.PaymentRepository;
import com.incture.MasterBUPA.entity.PaymentTransactions;
import com.incture.MasterBUPA.service.abstraction.PaymentTransactionService;


@Service
public class PaymentTransactionServiceImplementation implements PaymentTransactionService {
	
	private PaymentRepository paymentRepository;

	@Override
	public void save(PaymentTransactions paymentTransactions) {
		// TODO Auto-generated method stub
		paymentRepository.save(paymentTransactions);
	}
	

}

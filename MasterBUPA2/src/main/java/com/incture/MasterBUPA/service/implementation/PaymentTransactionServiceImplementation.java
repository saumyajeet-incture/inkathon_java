package com.incture.MasterBUPA.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.PaymentRepository;
import com.incture.MasterBUPA.entity.Address;
import com.incture.MasterBUPA.entity.PaymentTransactions;
import com.incture.MasterBUPA.service.abstraction.PaymentTransactionService;


@Service
public class PaymentTransactionServiceImplementation implements PaymentTransactionService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public List<Object[]> checkIfExists = null;

	@Override
	public void save(PaymentTransactions paymentTransactions) {
		// TODO Auto-generated method stub
		paymentRepository.save(paymentTransactions);
	}

	@Override
	public List<PaymentTransactions> findPaymentTransactions() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

	@Override
	public List<PaymentTransactions> findPaymentTransactionsById(int id) {
		// TODO Auto-generated method stub
		checkIfExists=paymentRepository.findDetail(id);
		int status=0;
		if(checkIfExists.isEmpty()){
			status=1;
			
		}
		List<PaymentTransactions> listPayments=new ArrayList<>();
		PaymentTransactions paymentTransactions;
		if(status==1){
			return null;
		}
		
		for(int i=0;i<checkIfExists.size();i++){
			paymentTransactions=new PaymentTransactions();
			paymentTransactions.setBankAccount((String) checkIfExists.get(i)[1]);
			paymentTransactions.setBankKey((String) checkIfExists.get(i)[2]);
			paymentTransactions.setBpId(id);
			paymentTransactions.setControlKey((String) checkIfExists.get(i)[4]);
			paymentTransactions.setiBAN((String) checkIfExists.get(i)[5]);
			paymentTransactions.setPaymentCity((String) checkIfExists.get(i)[6]);
			paymentTransactions.setPaymentId((Integer) checkIfExists.get(i)[0]);
			paymentTransactions.setReferenceDocument((String) checkIfExists.get(i)[7]);
			paymentTransactions.setTransactionID((String) checkIfExists.get(i)[8]);
			listPayments.add(paymentTransactions);
			
		}
		return listPayments;
	}
	

}

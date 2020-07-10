package com.incture.MasterBUPA.mapper;

import java.util.ArrayList;
import java.util.List;

import com.incture.MasterBUPA.dto.request.PaymentDTO;
import com.incture.MasterBUPA.entity.PaymentTransactions;

public class PaymentMapper {

	public static List<PaymentTransactions> checkPayment(List<PaymentDTO> paymentDTO, Integer bp_id){
		
		List<PaymentTransactions> listPayment=new ArrayList<>();
		
		for (PaymentDTO paymentDto : paymentDTO) {
			if (paymentDto.getBankAcct() != "" && paymentDto.getBankKey() != "" && paymentDto.getControlKey() != ""
					&& paymentDto.getIban() != "" && paymentDto.getId() != "" && paymentDto.getpCity() != ""
					&& paymentDto.getRefDoc()!= "") {
			PaymentTransactions payment = new PaymentTransactions();
			payment.setBpId(bp_id);
			payment.setBankAccount(paymentDto.getBankAcct());
			payment.setBankKey(paymentDto.getBankKey());
			payment.setControlKey(paymentDto.getControlKey());
			payment.setiBAN(paymentDto.getIban());
			payment.setPaymentCity(paymentDto.getpCity());
			payment.setReferenceDocument(paymentDto.getRefDoc());
			listPayment.add(payment);
			}
		}
		return listPayment;
		
	}

}

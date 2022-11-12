package com.payment_service.service;

import com.payment_service.entity.PaymentDetails;

public interface PaymentService {

	PaymentDetails doPay(PaymentDetails payment);
	 

}
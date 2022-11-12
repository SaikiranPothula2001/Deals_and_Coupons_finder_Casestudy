package com.payment_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.payment_service.entity.PaymentDetails;

public interface PaymentRepository extends MongoRepository<PaymentDetails, Integer> {

}

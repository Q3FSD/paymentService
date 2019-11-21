package com.mentorondemand.paymentservice.services;

import org.springframework.data.repository.CrudRepository;

import com.mentorondemand.paymentservice.entities.Payments;

//This will be AUTO IMPLEMENTED by Spring into a Bean called trainingRepository
//CRUD refers Create, Read, Update, Delete

public interface PaymentRepository extends CrudRepository<Payments, Long> {

	Iterable<Payments> findAllByMentorName(String mentorName);
}

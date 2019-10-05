package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
	
	
}

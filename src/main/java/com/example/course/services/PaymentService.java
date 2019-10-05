package com.example.course.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.dto.PaymentDTO;
import com.example.course.entities.Payment;
import com.example.course.repositories.PaymentRepository;
import com.example.course.services.exceptions.ResourceNotFoundException;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public List<PaymentDTO> findAll() {
		List<Payment> list = paymentRepository.findAll();
		return list.stream().map(e -> new PaymentDTO(e)).collect(Collectors.toList());
	}
	
	public PaymentDTO findById(Long id) {	
		Optional<Payment> obj = paymentRepository.findById(id);
		Payment entity = obj.orElseThrow(() -> new ResourceNotFoundException(id));
		return new PaymentDTO(entity);
	}
	
}

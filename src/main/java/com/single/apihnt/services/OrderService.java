package com.single.apihnt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.single.apihnt.entities.Order;
import com.single.apihnt.repositories.OrderRepository;

@Service  
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> FindAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
	 Optional<Order> obj =	repository.findById(id);
	 return obj.get();
	}
	
	
}


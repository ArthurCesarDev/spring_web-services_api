package com.single.apihnt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.single.apihnt.entities.Product;
import com.single.apihnt.repositories.ProductRepository;

@Service  
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> FindAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
	 Optional<Product> obj =	repository.findById(id);
	 return obj.get();
	}
	
	
}


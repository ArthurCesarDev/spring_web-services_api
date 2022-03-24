package com.single.apihnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.single.apihnt.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}

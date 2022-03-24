package com.single.apihnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.single.apihnt.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}

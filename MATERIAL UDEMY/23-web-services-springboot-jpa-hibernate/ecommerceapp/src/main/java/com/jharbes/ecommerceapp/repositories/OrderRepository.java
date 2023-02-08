package com.jharbes.ecommerceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jharbes.ecommerceapp.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

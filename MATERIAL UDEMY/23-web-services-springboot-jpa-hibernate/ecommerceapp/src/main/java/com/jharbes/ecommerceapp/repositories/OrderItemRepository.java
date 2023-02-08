package com.jharbes.ecommerceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jharbes.ecommerceapp.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

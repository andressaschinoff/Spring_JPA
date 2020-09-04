package com.andressaschinoff.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andressaschinoff.springjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}

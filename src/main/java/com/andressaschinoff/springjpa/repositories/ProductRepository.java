package com.andressaschinoff.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andressaschinoff.springjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

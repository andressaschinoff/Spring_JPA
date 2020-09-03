package com.andressaschinoff.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andressaschinoff.springjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}

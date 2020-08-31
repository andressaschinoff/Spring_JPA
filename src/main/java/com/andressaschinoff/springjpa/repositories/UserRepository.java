package com.andressaschinoff.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andressaschinoff.springjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

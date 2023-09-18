package com.numetry.NumetryTask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numetry.NumetryTask1.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}

package com.numetry.NumetryTask1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.numetry.NumetryTask1.dto.User;
import com.numetry.NumetryTask1.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository repository;

	public ResponseEntity<User> findUser(int id) {
		Optional<User> recUser = repository.findById(id);

		return new ResponseEntity<User>(HttpStatus.OK);

	}

}

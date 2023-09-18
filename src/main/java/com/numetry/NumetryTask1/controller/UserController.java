package com.numetry.NumetryTask1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.NumetryTask1.services.UserServices;

@RestController
public class UserController {

	@Autowired
	private UserServices services;

	@GetMapping("/users")
	public void getUser(@PathVariable int id) {
		services.findUser(id);
	}
}

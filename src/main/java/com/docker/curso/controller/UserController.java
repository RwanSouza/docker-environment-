package com.docker.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.curso.model.User;
import com.docker.curso.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public List<User>  findAll() {
		
		List<User> users = userRepository.findAll();
		
		return users;
	}
	
	@PostMapping
	public User createUser(@RequestBody User request) {
	
		userRepository.save(request);
		
		return request;
	}
}

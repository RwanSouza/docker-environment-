package com.docker.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.curso.model.User;
import com.docker.curso.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/users")
	public List<User>  findAll() {
		
		List<User> users = userRepository.findAll();
		
		return users;
	}
}

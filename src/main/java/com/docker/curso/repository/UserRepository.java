package com.docker.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.curso.model.User;

public interface UserRepository  extends  JpaRepository<User, Integer> { 
	
}

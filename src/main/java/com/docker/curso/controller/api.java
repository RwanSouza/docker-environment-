package com.docker.curso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class api {

	
	@RequestMapping("teste")
	public String  teste() {
		return "[Lista]";
	}
}

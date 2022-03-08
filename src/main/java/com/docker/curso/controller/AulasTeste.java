package com.docker.curso.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AulasTeste {
	public static void main(String[] args) {
		
		Aula java = new Aula("Java para iniciantes", 22);
		Aula go = new Aula("Curso de GO", 26);
		Aula spring = new Aula("Spring MVC", 25);
		Aula docker = new Aula("Docker", 28);
		
		List<Aula> aulas = new ArrayList<>();
		
		aulas.add(java);
		aulas.add(docker);
		aulas.add(go);
		aulas.add(spring);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}
}

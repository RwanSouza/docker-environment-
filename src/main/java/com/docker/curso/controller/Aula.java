package com.docker.curso.controller;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;
	
	
	public Aula(String aulas, int tempo) {
		this.titulo = aulas;
		this.tempo = tempo;
	}

	public String getAulas() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}


	@Override
	public int compareTo(Aula outraAula) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(outraAula.titulo);
	}

	@Override
	public String toString() {
		return "Aula titulo: " + titulo + ", tempo: " + tempo + "";
	}
	
}

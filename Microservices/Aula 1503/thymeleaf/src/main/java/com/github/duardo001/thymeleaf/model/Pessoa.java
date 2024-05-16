package com.github.duardo001.thymeleaf.model;

public class Pessoa {
	
	private Long id;
	private String nome;
	private String sexo;
	
	
	
	public Pessoa(long id, String nome, String sexo) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLast_name() {
		return nome;
	}
	public void setLast_name(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setGender(String sexo) {
		this.sexo = sexo;
	}

	
}

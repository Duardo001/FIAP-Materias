package com.github.duardo001.thymeleaf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
	@Id
	private Long id;
	private String nome;
	@Enumerated	(EnumType.STRING)
	private SexoTipo sexo;
	
	public Pessoa(long id, String nome, SexoTipo sexo) {
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
	public String getNome() {
		return nome;
	}
	public void setLast_name(String nome) {
		this.nome = nome;
	}
	public SexoTipo getSexo() {
		return sexo;
	}
	public void setSexo(SexoTipo sexo) {
		this.sexo = sexo;
	}

	
}

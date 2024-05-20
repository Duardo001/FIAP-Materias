package com.github.duardo001.mvc_rh.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco extends AbstractEntity<Long>{
	
	
	@Column(nullable = false, length = 60)
	private String bairro;
	
	@Column(nullable = false, length = 11)
	private String cep;
	
	@Column(nullable = false, length = 30)
	private String cidade;
	
	@Column(nullable = false, length = 20)
	private String complemento;
	
	@Column(length = 100)
	private String logradouro;
	
	@Column(nullable = false, length = 10)
	private int numero;
	
	@Column(nullable = false, length = 2)
	//@Enumerated(EnumType.STRING)
	private String uf;
	
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	

}

package com.github.duardo001.mvc_rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity<Long >{
	
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate data_entrada;
	

	private LocalDate data_saida;

	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, columnDefinition = "NUMERIC(15,2)")
	private BigDecimal salario;
	
	
	@OneToOne
	@JoinColumn(name = "cargo_id_fk", nullable = false)
	private Cargo cargo;
	
	@OneToOne
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;
	
	
	public LocalDate getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(LocalDate data_entrada) {
		this.data_entrada = data_entrada;
	}
	public LocalDate getData_saida() {
		return data_saida;
	}
	public void setData_saida(LocalDate data_saida) {
		this.data_saida = data_saida;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	

}

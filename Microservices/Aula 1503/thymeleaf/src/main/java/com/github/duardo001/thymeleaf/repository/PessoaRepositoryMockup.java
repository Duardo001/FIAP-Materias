package com.github.duardo001.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.duardo001.thymeleaf.model.Pessoa;

public class PessoaRepositoryMockup {

	// Queremos ter
	// 1 Caminhão Optimus Prime Autobot
	// 2 Ferrari Santana com Carburador

	public List<Pessoa> list() {
		List<Pessoa> result = new ArrayList<>();

		Pessoa pessoa = new Pessoa(1L, "Caminhão", "Optimus Prime Autobot");
		result.add(pessoa);


		pessoa = new Pessoa(2L, "Ferrari", "Santana com Carburador");
		result.add(pessoa);

		result.add(new Pessoa(3L, "Coringa", "Batman"));

		return result;
	}
}

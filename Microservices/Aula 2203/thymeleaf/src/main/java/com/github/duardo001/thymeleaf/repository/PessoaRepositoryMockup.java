package com.github.duardo001.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.duardo001.thymeleaf.model.Pessoa;
import com.github.duardo001.thymeleaf.model.SexoTipo;


@Service
public class PessoaRepositoryMockup {

	// Queremos ter
	// 1 Caminhão Optimus Prime Autobot
	// 2 Ferrari Santana com Carburador

	public List<Pessoa> list() {
		List<Pessoa> result = new ArrayList<>();

		Pessoa pessoa = new Pessoa(1L, "Caminhão", SexoTipo.M);
		result.add(pessoa);


		pessoa = new Pessoa(2L, "Ferrari", SexoTipo.F);
		result.add(pessoa);

		result.add(new Pessoa(3L, "Coringa", SexoTipo.M));

		return result;
	}
}

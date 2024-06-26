package com.github.duardo001.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.duardo001.thymeleaf.model.Pessoa;
import com.github.duardo001.thymeleaf.repository.PessoaRepository;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String lista(Model model) {
		List<Pessoa> pessoas = pessoaRepository.findAll();
		model.addAttribute("pessoas", pessoas);
		return "pessoa/lista.html";
	}
		
}

package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.FornecedorPostDTO;
import br.com.cotiinformatica.dtos.FornecedorPutDTO;

@RestController
@RequestMapping(value = "/api/fornecedores")
public class FornecedoresController {

	@PostMapping
	public void post(@RequestBody FornecedorPostDTO dto) {
		// TODO
	}

	@PutMapping
	public void put(@RequestBody FornecedorPutDTO dto) {
		// TODO
	}

	@DeleteMapping("{idFornecedor}")
	public void delete(@PathVariable("idFornecedor") Integer idFornecedor) {
		// TODO
	}

	@GetMapping
	public void getAll() {
		// TODO
	}

	@GetMapping("{idFornecedor}")
	public void getById(@PathVariable("idFornecedor") Integer idFornecedor) {
		// TODO
	}
}

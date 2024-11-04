package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entities.Departamento;
import com.example.demo.entities.Funcionario;
import com.example.demo.services.FuncionarioService;

public class FuncionarioController {

private FuncionarioService funcionarioService = new FuncionarioService();
	
	@Autowired
	public FuncionarioController (FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}
	
	@PostMapping("/criar")
	public Funcionario criarFuncionario(@RequestBody Long funcionario) {
		return funcionarioService.salvarFarmacia(funcionario);
	}
		
	@GetMapping
	public List<Funcionario> buscarTodos(){
		return funcionarioService.buscarTodosFuncionarios();
	}
	
	@GetMapping("/{id}")
	public Funcionario buscarPorId(@PathVariable Long id) {
		return funcionarioService.buscarFuncionarioPorId(id);
	}
	
}
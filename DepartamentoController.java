package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entities.Departamento;
import com.example.demo.services.DepartamentoService;

public class DepartamentoController {

private DepartamentoService departamentoService = new DepartamentoService();
	
	@Autowired
	public DepartamentoController (DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}
	
	@PostMapping("/criar")
	public Departamento criarDepartamento(@RequestBody Long departamento) {
		return departamentoService.salvarFarmacia(departamento);
		
	}
		
	@GetMapping
	public List<Departamento> buscarTodos(){
		return departamentoService.buscarTodosFarmacia();
	}
	
	@GetMapping("/{id}")
	public Departamento buscarPorId(@PathVariable Long id) {
		return departamentoService.buscarFuncionarioPorId(id);
	}
	
}
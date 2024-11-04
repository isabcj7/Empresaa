package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Departamento {
	private int depCodigo;
	private String nome;
	
	
	public String setnome(String nome) {
		return this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int setdepCodigo(int depCodigo) {
		return this.depCodigo = depCodigo;
	}
	
	public int getdepCodigo() {
		return depCodigo;
	}
	
}
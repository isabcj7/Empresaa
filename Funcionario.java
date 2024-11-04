package com.example.demo.entities;

public class Funcionario {
	
	private int funCodigo;
	private int depCodigo;
	private String funNome;
	private int funNascimento;
	private int funSalario;

	public int setdepCodigo(int depCodigo) {
		return this.depCodigo = depCodigo;
	}
	
	public int getdepCodigo() {
		return depCodigo;
	}
	
	public int setfunCodigo(int funCodigo) {
		return this.funCodigo = funCodigo;
	}
	
	public int getfunCodigo() {
		return funCodigo;
	}
	
	public int setfunNascimento(int funNascimento) {
		return this.funNascimento = funNascimento;
	}
	
	public int getfunNascimento() {
		return funNascimento;
	}
	
	public int setfunSalario(int funSalario) {
		return this.funSalario = funSalario;
	}
	
	public int getfunSalario() {
		return funSalario;
	}
	
	public String funNome(String funNome) {
		return this.funNome = funNome;
	}
	
	public String getfunNome() {
		return funNome;
	}
}
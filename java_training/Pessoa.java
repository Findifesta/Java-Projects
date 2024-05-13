package com.LISTA;

//Utilizado para verificar o consumo de carne na classe Churrasco
	public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	private boolean vegetariana;
	
	Pessoa (String nome, String sexo, int idade, boolean vegetariana){
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}
	
	public String getnome() {
		return nome;
	}
	
	public String getsexo() {
		return sexo;
	}
	
	public int getidade() {
		return idade;
	}
	
	public boolean isvegetariana() {
		return vegetariana;
	}
	
}

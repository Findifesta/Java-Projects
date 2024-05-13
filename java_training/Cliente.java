package com.LISTA;


//Delimita um saldo de um cliente realizando operações bancárias, atualizando o valor na conta.

public class Cliente {
private String nome;
private double saldo;
private double limite;


public Cliente(String nome, double saldo, double limite) {
	super();
	this.nome = nome;
	this.saldo = saldo;
	this.limite = limite;
}


public void sacar(double quantia) {
	if (quantia <= saldo+limite) {
		System.out.println("Valor retirado");
		if (saldo < quantia) {
			double credito = quantia-saldo;
			saldo = 0;
			limite -= credito;
		}
		if (saldo >= quantia) {
			saldo -= quantia;
		}
	}
	else {
		System.out.println("Valor indisponível");
	}
}

public void depositar(double quantia) {
	saldo += quantia;
}
public void checarSaldo() {
	double total = limite+saldo;
	System.out.println("Saldo atual: "+total);
}
public void obterNome() {
	System.out.println("Nome do cliente: "+nome);
}
}
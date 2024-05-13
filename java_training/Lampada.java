package com.LISTA;

//Modifica o estado de uma lampada de acordo com o método utilizado

public class Lampada {
	estado Estado = estado.apagada;
	int contador;

	void click() {
		switch (Estado) {
		case apagada:
			contador ++;
			Estado = estado.acesa;
			System.out.println("Lampada acende");
			break;
		case acesa:
			Estado = estado.apagada;
			System.out.println("Lampada apaga");
			break;
		}
	}
	void qtdAcendimentos() {
		System.out.println("A lâmpada acendeu um total de " + contador + " vezes");
	}
	void checaEstado() {
		if (Estado == estado.apagada) {
			System.out.println("A lâmpada está apagada");
		}
		else {
			System.out.println("A lâmpada está acesa");
		}
	}
}
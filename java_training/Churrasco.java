package com.LISTA;

//verifica o consumo de cada indivíduo, a partir da classe Pessoa

public class Churrasco {
	double qtCarne = 0;


	
	//eu fiz seguindo do menor consumo ao maior, pra ficar mais lógica a leitura
	void verificarConsumo(Pessoa pessoa) {
		//ao invés de fazer dois ifs pra colocar que a qtdCarne é 0, eu colocou um || (OU)
		if(pessoa.getidade() <= 3 || pessoa.isvegetariana()) {
			System.out.println(pessoa.getnome() + " não consome carne.");
		}
		//como eu fiz progressivo, eu posso ir limitando melhor de acordo com as idades,
		// pq já teve uma seleção anterior
		else if(pessoa.getidade() <= 12) {
			qtCarne += 1;
			System.out.println(pessoa.getnome() + " consome 1kg de carne.");
		}
		//e facilita pro ultimo else
		else {
			qtCarne +=2;
			System.out.println(pessoa.getnome() + " consome 2kg carne.");
		}
		System.out.println("Somando esta pessoa, serão consumidos "+ qtCarne +" kg de carne!");
	}
}
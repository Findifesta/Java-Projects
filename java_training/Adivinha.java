package com.LISTA;
import java.util.Random;

//Recebe uma pergunta e um número da sorte. Retorna aleatoriamente uma resposta entre sim ou não e
//um número entre 0 e 100, comparando-o com o selecionado no prompt.
public class Adivinha {
    private int numeroAleatorio;
    private boolean destino;
    private Random random;

    public Adivinha() {
        random = new Random();
    }

    public void sortear(int sorte) {
        numeroAleatorio = random.nextInt(100);
        if (sorte == numeroAleatorio) {
        System.out.println("UAU, VOCÊ ACERTOU!");
        }
        else {
        	System.out.println("Errou! Você escolheu "+sorte+" e o número sorteado foi "+ numeroAleatorio);
        }
    }

    public void perguntar(String pergunta) {
        destino = random.nextBoolean();
        if (destino) {
            System.out.println("A resposta para a pergunta '" + pergunta + "' é SIM!");
        } else {
            System.out.println("A resposta para a pergunta '" + pergunta + "' é NÃO!");
        }
    }
}

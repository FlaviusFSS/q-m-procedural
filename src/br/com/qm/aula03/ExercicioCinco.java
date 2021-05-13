package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Soma dos n�meros inteiros N POSITIVOS");
		System.out.println("Digite qual a quantidade de N�meros: ");
		int qtdNumeros = teclado.nextInt();

		if (qtdNumeros < 0) {
			System.out.println("Quantidade Inv�lida!");
			return; //a fun��o retorna, ou seja, quando entrar nessa condi��o, ele para o programa nesse ponto
		}

		int soma = 0;
		for (int i = 1; i < qtdNumeros; i++) {
			soma += i;
		}

		System.out.printf("A soma dos %d Inteiros Positivos � %d", qtdNumeros, soma);

		teclado.close();

	}

}

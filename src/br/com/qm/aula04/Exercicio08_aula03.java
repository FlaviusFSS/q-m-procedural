package br.com.qm.aula04;

import java.util.Scanner;

public class Exercicio08_aula03 {


	// Fa�a um programa que pe�a um n�mero inteiro e 
	//determine se ele � ou n�o um n�mero primo. 
	//Um n�mero primo � aquele que 
	//� divis�vel somente por ele mesmo e por 1.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## DESCOBRIDOR DE PRIMOS ##");
		System.out.println("Digite um n�mero inteiro e "
				+ "eu te direi se ele � ou n�o primo.");
		int numeroLido = teclado.nextInt();

		int contador = 0;
		// resto da divis�o � 0


		// numeroLido = 5
		// contador = 0
		// numeroLido = 8
		// contador = 1
		for (int i = numeroLido - 1; i > 1; i--) {
			// 1 itera��o i = 4
			// 2 itera��o i = 3
			// 3 itera��o i = 2

			// 1 itera��o i = 7
			// 2 itera��o i = 6
			// 3 itera��o i = 5
			// 4 itera��o i = 4
			if (numeroLido % i == 0) {
				contador++;
				break;
			}

		}

		if (contador == 1) {
			System.out.println("N�o � primo!");
		} else {
			System.out.println("� primo!");
		}

		teclado.close();
	}

}
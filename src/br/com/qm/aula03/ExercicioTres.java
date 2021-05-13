package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("~~ A Maior e A Menor ~~");
		
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite um valor: ");
			int valorLido = teclado.nextInt();
			
			if (valorLido > maior) {
				maior = valorLido;
			}
			
			if (valorLido < menor) {
				menor = valorLido;
			}
			
		}
		
		teclado.close();
	}

}

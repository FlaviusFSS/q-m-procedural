package br.com.qm.aula02;

import java.util.Scanner;

public class Exerc�cioSete {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Comparando N�meros... ");
		System.out.println("Digite um n�mero: ");
		int numeroLido = teclado.nextInt();
		
		
		if (numeroLido == 0) {
			System.out.printf("O n�mero %d � nulo", numeroLido);
		}else if (numeroLido > 0) {
			System.out.printf("O n�mero %d � positivo", numeroLido);
		}
		else{
			System.out.printf("O n�mero %d � negativo", numeroLido);
		}
		
		teclado.close();

	}

}

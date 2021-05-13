package br.com.qm.aula02;

import java.util.Scanner;

public class ExercícioSete {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Comparando Números... ");
		System.out.println("Digite um número: ");
		int numeroLido = teclado.nextInt();
		
		
		if (numeroLido == 0) {
			System.out.printf("O número %d é nulo", numeroLido);
		}else if (numeroLido > 0) {
			System.out.printf("O número %d é positivo", numeroLido);
		}
		else{
			System.out.printf("O número %d é negativo", numeroLido);
		}
		
		teclado.close();

	}

}

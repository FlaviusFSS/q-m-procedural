package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Comparando Números... ");
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			System.out.printf("O número %d é maior que %d", primeiroNumero, segundoNumero);
		}else{
			System.out.printf("O número %d é maior que %d", segundoNumero, primeiroNumero);
		}
		
		teclado.close();
		

	}

}

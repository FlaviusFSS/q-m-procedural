package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Comparando N�meros... ");
		System.out.println("Digite o primeiro n�mero: ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			System.out.printf("O n�mero %d � maior que %d", primeiroNumero, segundoNumero);
		}else{
			System.out.printf("O n�mero %d � maior que %d", segundoNumero, primeiroNumero);
		}
		
		teclado.close();
		

	}

}

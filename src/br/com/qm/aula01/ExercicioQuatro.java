package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculando valor ao quadrado ");
		System.out.println("Informe o valor a ser elevado: ");
		float valorLido = teclado.nextFloat();
		
		float valoraoQuadrado = valorLido * valorLido;
		
		System.out.printf("O resultado do valor ao quadrado de %.2f é: %.2f", valorLido, valoraoQuadrado);
		
		teclado.close();

	}

}

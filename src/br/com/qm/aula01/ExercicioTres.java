package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int primeiroValor = teclado.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int segundoValor = teclado.nextInt();
		
		System.out.println("Informe o terceiro valor: ");
		int terceiroValor = teclado.nextInt();
		
		int soma = primeiroValor + segundoValor + terceiroValor;
		
		System.out.printf("A soma é: %d", soma);
		
		teclado.close();

	}

}

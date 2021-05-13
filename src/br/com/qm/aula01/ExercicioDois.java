package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Seja bem vindo, informe um valor real: ");
		float realLido = teclado.nextFloat();

		System.out.printf("O Seu Valor é... %.2f", realLido);

	}

}

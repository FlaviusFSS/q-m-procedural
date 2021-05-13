package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Seja bem vindo, informe um valor: ");
		
		int i = teclado.nextInt();
		
		System.out.printf("\nO Seu Valor é... %d", i);
	}

}

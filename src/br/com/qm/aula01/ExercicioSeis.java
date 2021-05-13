package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculando a Área do Quadrado...");
		
		System.out.println("Digite o tamanho do lado: ");
		int lado = teclado.nextInt();
		int area = lado * lado;
		
		System.out.printf("O valor da área do quadrado é: %d", area);

	}

}

package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculando a �rea do Ret�ngulo...");
		
		System.out.println("Digite o tamanho da base: ");
		int base = teclado.nextInt();
		
		System.out.println("Digite o tamanho da altura: ");
		int altura = teclado.nextInt();
		
		int area = base * altura;
		
		System.out.printf("O valor da �rea do ret�ngulo �: %d", area);


	}

}

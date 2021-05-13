package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Conversor de km/h em m/s ... ");
		System.out.println("Digite o Valor em km/h :  ");
		float velocidadeKm = teclado.nextFloat();
		
		float velocidadeMs = velocidadeKm * 3.6F;
		
		System.out.printf("A velocidade digitada em m/s é: %.2f", velocidadeMs);
		
		teclado.close();
		

	}

}

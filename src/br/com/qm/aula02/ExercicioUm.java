package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioUm {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Conversor de Polegadas em cm ... ");
		System.out.println("Digite o Valor em '' :  ");
		float valorPolegadas = teclado.nextFloat();
		
		float valorCentimetros = valorPolegadas * 2.54F;
		
		System.out.printf("O Valor %.2f polegadas equivale a %.2f cm %.2f", valorPolegadas, valorCentimetros);
		
		teclado.close();
		
	}
	
}

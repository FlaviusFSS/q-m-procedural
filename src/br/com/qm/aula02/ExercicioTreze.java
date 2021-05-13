package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioTreze {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Calculadora de Aprovação ");
		System.out.println("Digite a primeira Nota: ");
		float primeiraNota = teclado.nextFloat();

		System.out.println("Digite a segunda Nota:  ");
		float segundaNota = teclado.nextFloat();
		
		float media = (primeiraNota + segundaNota) / 2F;

		if (media < 7) {
			System.out.println("Reprovado");
		} else if (media < 10) {
			System.out.println("Aprovado");
		}
		else{
			System.out.println("Aprovado com Distinção");
		}

		teclado.close();


	}
}

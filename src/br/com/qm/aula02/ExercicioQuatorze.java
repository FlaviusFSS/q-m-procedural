package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatorze {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("~~ Dias da Semana ~~");
		System.out.println("Digite 1 n�mero inteiro");
		
		int dia = teclado.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Domingo ");
			break;
		case 2:
			System.out.println("Segunda-feira ");
			break;
		case 3:
			System.out.println("Ter�a-feira ");
			break;
		case 4:
			System.out.println("Quarta-feira ");
			break;
		case 5:
			System.out.println("Quinta-feira ");
			break;
		case 6:
			System.out.println("Sexta-feira ");
			break;
		case 7:
			System.out.println("S�bado ");
			break;
			
		default:
			System.out.println("Digite um n�mero v�lido!");
			break;

		}

		teclado.close();
		
	}

}

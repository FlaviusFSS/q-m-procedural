package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Verificando Aprovação ");
		System.out.println("Digite a primeira nota do maluvido: ");
		float primeiraNota = teclado.nextFloat();

		System.out.println("Digite a segunda nota do maluvido: ");
		float segundaNota = teclado.nextFloat();
		
		System.out.println("Digite a terceira nota do maluvido: ");
		float terceiraNota = teclado.nextFloat();

		float mediaMaluvido = (primeiraNota * 1F + segundaNota * 1F + terceiraNota * 2F  / (1F + 1F + 2F));

		if (mediaMaluvido >= 6) {
			System.out.println("O Maluvido escapou fedendo... ");
		}else{
			System.out.printf("O Maluvido se lascou!!!!!!!!!");
		}

		teclado.close();

	}

}

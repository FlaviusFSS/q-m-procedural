package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculando Degraus...");
		System.out.println("Digite a Altura do degrau em cm:");
		float alturaDegrau = teclado.nextFloat();
		System.out.println("Digite a Altura da escada em m:");
		float alturaEscada = teclado.nextFloat();
		
		
		float qtdDegraus = (alturaEscada * 100) / alturaDegrau;
		
		System.out.printf("A quantidade de Degraus dessa escada é... %.0f", qtdDegraus);
		
		teclado.close();
	}
	
}

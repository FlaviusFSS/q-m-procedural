package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Encontrando o Antecessor e o Sucessor...");
		
		System.out.println("Digite um valor inteiro: ");
		int inteiroLido = teclado.nextInt();
		
		int antecessor = inteiroLido - 1;
		int sucessor = inteiroLido + 1;
		
		System.out.printf("O seu antecessor é: %d e o seu sucessor é %d", antecessor, sucessor);
		
		teclado.close();

	}

}

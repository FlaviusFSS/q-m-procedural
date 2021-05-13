package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculando o Ano do Nascimento... ");
		System.out.println("Digite a sua idade:  ");
		int idade = teclado.nextInt();
		System.out.println("Digite o Ano Atual:  ");
		int anoAtual = teclado.nextInt();
		
		int anoNascimento = anoAtual - idade;
		
		System.out.printf("O nascimento foi no ano de: %d", anoNascimento);
		
		teclado.close();
		

	}

}

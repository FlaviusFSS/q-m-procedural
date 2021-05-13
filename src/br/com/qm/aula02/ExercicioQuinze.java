package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuinze {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("~~ CALCULADORA DE DOIS VALORES ~~");
		System.out.println("Digite 1 para soma");
		System.out.println("Digite 2 para subtração");
		System.out.println("Digite 3 para multiplicação");
		System.out.println("Digite 4 para divisão");
		
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o primeiro valor: ");
			float primeiroVslor = teclado.nextFloat();
			System.out.println("Digite o segundo valor: ");
			float segundoVslor = teclado.nextFloat();
			float soma = primeiroVslor + segundoVslor;
			break;
		case 2:
			System.out.println("Digite o primeiro valor: ");
			float primeiroValor = teclado.nextFloat();
			System.out.println("Digite o segundo valor: ");
			float segundoValor  = teclado.nextFloat();
			float subtracao = primeiroVslor - segundoVslor;
			break;
		case 3:
			System.out.println("Digite o primeiro valor: ");
			float primeiroValor = teclado.nextFloat();
			System.out.println("Digite o segundo valor: ");
			float segundoValor  = teclado.nextFloat();
			float multiplicacao = primeiroVslor * segundoVslor;
			break;
		case 4:
			System.out.println("Digite o primeiro valor: ");
			float primeiroValor = teclado.nextFloat();
			System.out.println("Digite o segundo valor: ");
			float segundoValor  = teclado.nextFloat();
			float divisao = primeiroVslor / segundoVslor;
			break;
			

		default:
			break;
		}
	}

}

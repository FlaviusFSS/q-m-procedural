package br.com.qm.aula02;

import java.util.Scanner;

public class ExercícioNove {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Consulta para Empréstimo ");
		System.out.println("Digite o seu salário: ");
		float salario = teclado.nextFloat();

		System.out.println("Digite o valor da Prestação: ");
		float prestacao = teclado.nextFloat();

		boolean emprestimoConcedido = prestacao < salario * 0.2F;
		
		if (emprestimoConcedido) {
			System.out.println("Empréstimo aprovado!!!");
		}else{
			System.out.printf("Empréstimo não aprovado.");
		}

		teclado.close();

	}

}

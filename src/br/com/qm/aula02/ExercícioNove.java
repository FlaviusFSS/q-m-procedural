package br.com.qm.aula02;

import java.util.Scanner;

public class Exerc�cioNove {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Consulta para Empr�stimo ");
		System.out.println("Digite o seu sal�rio: ");
		float salario = teclado.nextFloat();

		System.out.println("Digite o valor da Presta��o: ");
		float prestacao = teclado.nextFloat();

		boolean emprestimoConcedido = prestacao < salario * 0.2F;
		
		if (emprestimoConcedido) {
			System.out.println("Empr�stimo aprovado!!!");
		}else{
			System.out.printf("Empr�stimo n�o aprovado.");
		}

		teclado.close();

	}

}

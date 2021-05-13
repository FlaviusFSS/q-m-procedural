package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioDoze_aula02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Encontrando o Produto mais Barato ");
		System.out.println("Digite o valor do primeiro produto: ");
		float primeiroProduto = teclado.nextFloat();

		System.out.println("Digite o valor do segundo produto: ");
		float segundoProduto = teclado.nextFloat();

		System.out.println("Digite o valor do terceiro produto: ");
		float terceiroProduto = teclado.nextFloat();

		if (primeiroProduto == segundoProduto && segundoProduto == terceiroProduto) {
			System.out.println("Fica a sua escolha pela qualidade, o gasto será o mesmo ");
		} else if (primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto) {
			System.out.println("Compre o primeiro produto.");
		} else if (primeiroProduto > segundoProduto && primeiroProduto > terceiroProduto) {
			System.out.println("Compre o segundo produto.");
		}
		else{
			System.out.println("Compre o terceiro produto.");
		}

		teclado.close();


	}

}

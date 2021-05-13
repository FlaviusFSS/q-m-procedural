package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculando Desconto... ");
		System.out.println("Digite o Valor do produto: ");
		float valorProduto = teclado.nextFloat();
		
		float valorComDesconto = (valorProduto * 0.88F);
		System.out.printf("O Valor do produto com descont é... %.2f", valorComDesconto);
		
		teclado.close();
		
	}

}

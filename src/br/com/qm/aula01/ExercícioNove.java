package br.com.qm.aula01;

import java.util.Scanner;

public class Exerc�cioNove {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println
		("Encontrando o a soma do triplo do sucessor e o dobro do antecessor...");

		System.out.println("Digite um valor inteiro: ");
		int inteiroLido = teclado.nextInt();

		int sucessorTriplicado = (inteiroLido *3) + 1;
		int antecessorDobrado = (inteiroLido *2) - 1;
		
		int soma = sucessorTriplicado + antecessorDobrado;

		System.out.printf("A soma de m�ltiplos do Sucessor com o Antecessor � %d", soma);

		teclado.close();


	}

}

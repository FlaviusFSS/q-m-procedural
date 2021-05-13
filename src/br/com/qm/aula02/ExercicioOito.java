package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Maior e a Diferença ");
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = teclado.nextInt();

		System.out.println("Digite o segundo número: ");
		int segundoNumero = teclado.nextInt();

		if (primeiroNumero == segundoNumero) {
			System.out.printf("Os números são os mesmos");
		}else if (primeiroNumero > segundoNumero) {
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("A diferença do primeiro número %d para o segundo número %d é %d", primeiroNumero, segundoNumero, diferenca);
		}
		else{
			System.out.printf("O segundo número %d é maior que o primeiro número %d", segundoNumero, primeiroNumero);
		}

		teclado.close();

	}

}

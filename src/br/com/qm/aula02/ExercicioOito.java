package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Maior e a Diferen�a ");
		System.out.println("Digite o primeiro n�mero: ");
		int primeiroNumero = teclado.nextInt();

		System.out.println("Digite o segundo n�mero: ");
		int segundoNumero = teclado.nextInt();

		if (primeiroNumero == segundoNumero) {
			System.out.printf("Os n�meros s�o os mesmos");
		}else if (primeiroNumero > segundoNumero) {
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("A diferen�a do primeiro n�mero %d para o segundo n�mero %d � %d", primeiroNumero, segundoNumero, diferenca);
		}
		else{
			System.out.printf("O segundo n�mero %d � maior que o primeiro n�mero %d", segundoNumero, primeiroNumero);
		}

		teclado.close();

	}

}

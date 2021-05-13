package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Verificando quem é o Maior ");
		System.out.println("Digite o primeiro número: ");
		float primeiroNumero = teclado.nextFloat();

		System.out.println("Digite o segundo número: ");
		float segundoNumero = teclado.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float terceiroNumero = teclado.nextFloat();

		if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("Os números são iguais ");
		} else if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro Número é maior.");
		} else if (primeiroNumero < segundoNumero && segundoNumero > terceiroNumero) {
			System.out.println("O segundo Número é maior.");
		}
		else{
			System.out.println("O terceiro Número é maior.");
		}

		teclado.close();

	}

}

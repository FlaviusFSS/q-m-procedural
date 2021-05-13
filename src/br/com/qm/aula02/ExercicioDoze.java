package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Verificando quem é o Maior ");
		System.out.println("Digite o primeiro número: ");
		float primeiroNumero = teclado.nextFloat();

		System.out.println("Digite o segundo número: ");
		float segundoNumero = teclado.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float terceiroNumero = teclado.nextFloat();
		
		boolean numerosIguais = primeiroNumero == segundoNumero
								&& segundoNumero == terceiroNumero;

		boolean primeiroMaior = primeiroNumero > segundoNumero
								&& primeiroNumero > terceiroNumero;

		boolean segundoMaior = primeiroNumero < segundoNumero
								&& segundoNumero > terceiroNumero;
								
		
		if (numerosIguais) {
			System.out.println("Os números são iguais ");
		} else if (primeiroMaior) {
			System.out.println("O primeiro Número é maior.");
		} else if (segundoMaior) {
			System.out.println("O segundo Número é maior.");
		}
		else{
			System.out.println("O terceiro Número é maior.");
		}

		teclado.close();

	}

}

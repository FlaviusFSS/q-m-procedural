package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Verificando quem � o Maior ");
		System.out.println("Digite o primeiro n�mero: ");
		float primeiroNumero = teclado.nextFloat();

		System.out.println("Digite o segundo n�mero: ");
		float segundoNumero = teclado.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		float terceiroNumero = teclado.nextFloat();
		
		boolean numerosIguais = primeiroNumero == segundoNumero
								&& segundoNumero == terceiroNumero;

		boolean primeiroMaior = primeiroNumero > segundoNumero
								&& primeiroNumero > terceiroNumero;

		boolean segundoMaior = primeiroNumero < segundoNumero
								&& segundoNumero > terceiroNumero;
								
		
		if (numerosIguais) {
			System.out.println("Os n�meros s�o iguais ");
		} else if (primeiroMaior) {
			System.out.println("O primeiro N�mero � maior.");
		} else if (segundoMaior) {
			System.out.println("O segundo N�mero � maior.");
		}
		else{
			System.out.println("O terceiro N�mero � maior.");
		}

		teclado.close();

	}

}

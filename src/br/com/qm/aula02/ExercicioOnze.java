package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Verificando quem � o Maior ");
		System.out.println("Digite o primeiro n�mero: ");
		float primeiroNumero = teclado.nextFloat();

		System.out.println("Digite o segundo n�mero: ");
		float segundoNumero = teclado.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		float terceiroNumero = teclado.nextFloat();

		if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("Os n�meros s�o iguais ");
		} else if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro N�mero � maior.");
		} else if (primeiroNumero < segundoNumero && segundoNumero > terceiroNumero) {
			System.out.println("O segundo N�mero � maior.");
		}
		else{
			System.out.println("O terceiro N�mero � maior.");
		}

		teclado.close();

	}

}

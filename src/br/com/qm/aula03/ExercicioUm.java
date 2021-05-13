package br.com.qm.aula03;

public class ExercicioUm {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 25; i++) {
			System.out.println(i);
		}
		
		int i = 1;
		while (i <= 25) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("~~ DO WHILE ~~");
		do {
			System.out.println(i = 1);
			i++;
		} while (i <= 25);
	}

}

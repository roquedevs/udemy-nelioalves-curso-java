package estrutura.dados.vetores.exercicios;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vect = new int[n];
		int soma = 0;
		int contador = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();

			if (vect[i] % 2 == 0) {
				soma = soma + vect[i];
				contador = contador + 1;
			}
		}

		if (soma > 0) {
			double avg = soma / contador;
			System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}

}

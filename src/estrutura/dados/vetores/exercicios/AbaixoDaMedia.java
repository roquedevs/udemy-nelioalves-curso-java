package estrutura.dados.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma = soma + vect[i];
		}

		double avg = soma / vect.length;

		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}

package estrutura.dados.vetores.exercicios;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NUMEROS PARES:");
		int contador = 0;
		for (int i = 0; i < vect.length; i++) {
			int numero = vect[i];
			if (numero % 2 == 0) {
				System.out.print(numero + "  ");
				contador++;
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + contador);
		sc.close();
	}

}

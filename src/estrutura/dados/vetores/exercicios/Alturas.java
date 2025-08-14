package estrutura.dados.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}

		double alturas = 0.0;
		int contador = 0;
		for (int i = 0; i < vect.length; i++) {
			alturas += vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				contador++;
			}
		}

		System.out.println();
		System.out.printf("Altura média: %.2f%n", (alturas / vect.length));
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (contador * 100.0 / vect.length));

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

		sc.close();
	}

}

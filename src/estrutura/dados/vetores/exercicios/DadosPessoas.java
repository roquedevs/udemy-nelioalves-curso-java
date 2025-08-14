package estrutura.dados.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", (i + 1));
			double altura = sc.nextDouble();

			System.out.printf("Genero da %da pessoa: ", (i + 1));
			char genero = sc.next().charAt(0);

			vect[i] = new Pessoa(altura, genero);
		}

		double maiorAltura = vect[0].getAltura();
		double menorAltura = vect[0].getAltura();
		double idades = 0.0;
		int homens = 0;
		int mulheres = 0;

		for (int i = 0; i < vect.length; i++) {

			Pessoa pessoa = vect[i];

			if (pessoa.getAltura() > maiorAltura) {
				maiorAltura = pessoa.getAltura();
			}
			if (pessoa.getAltura() < menorAltura) {
				menorAltura = pessoa.getAltura();
			}
			if (pessoa.getGenero().equals('F')) {
				idades += pessoa.getAltura();
				mulheres++;
			} else {
				homens++;
			}
		}

		double avg = idades / mulheres;

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", avg);
		System.out.println("Numero de homens = " + homens);

		sc.close();
	}

}

package estrutura.dados.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Aluno[] vect = new Aluno[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", (i + 1));
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Aluno(nome, nota1, nota2);
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vect.length; i++) {
			Aluno aluno = vect[i];
			if (aluno.aprovado()) {
				System.out.println(aluno.getNome());
			}
		}
		sc.close();
	}

}

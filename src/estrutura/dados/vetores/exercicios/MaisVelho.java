package estrutura.dados.vetores.exercicios;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n", (i+1));
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new Pessoa(nome, idade);
		}
		
		int maiorIdade = vect[0].getIdade();
		String maisVelho = "";
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getIdade() > maiorIdade) {
				maiorIdade = vect[i].getIdade();
				maisVelho = vect[i].getNome();
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + maisVelho);
		sc.close();
	}

}

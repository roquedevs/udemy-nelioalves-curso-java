package logica.programacao.estrutura.condicional.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos");			
		}
		else {
			System.out.println("Nao sao multiplos");			
		}
		
		sc.close();
	}

}

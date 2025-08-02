package logica.programacao.estrutura.repetitiva.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int senhaDigitada = sc.nextInt();
		
		while (senhaDigitada != senha) {
			System.out.println("Senha Inválida");
			senhaDigitada = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}

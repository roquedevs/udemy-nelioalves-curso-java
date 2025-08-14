package logica.programacao.estrutura.sequencial.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, soma;
		
		primeiroNumero = sc.nextInt();
		segundoNumero = sc.nextInt();
		soma = primeiroNumero + segundoNumero;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}

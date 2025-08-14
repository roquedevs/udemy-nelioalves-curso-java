package logica.programacao.estrutura.condicional.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigoItem, quantidadeItem;
		double valorAPagar, precoItem;

		codigoItem = sc.nextInt();
		quantidadeItem = sc.nextInt();

		if (codigoItem == 1) {
			precoItem = 4.00;
		}
		else if (codigoItem == 2) {
			precoItem = 4.50;
		} 
		else if (codigoItem == 3) {
			precoItem = 5.00;
		} 
		else if (codigoItem == 4) {
			precoItem = 2.00;
		} 
		else {
			precoItem = 1.50;
		}

		valorAPagar = precoItem * quantidadeItem;
		
		System.out.printf("Total: R$ %.2f%n", valorAPagar);
		sc.close();
	}

}

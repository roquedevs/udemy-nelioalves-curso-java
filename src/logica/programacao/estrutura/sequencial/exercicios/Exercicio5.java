package logica.programacao.estrutura.sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
		double valorUnitarioPeca1, valorUnitarioPeca2, valorTotalPeca1, valorTotalPeca2, valorTotalAPagar;
		
		codigoPeca1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroPecas2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();
		
		valorTotalPeca1 = numeroPecas1 * valorUnitarioPeca1;
		valorTotalPeca2 = numeroPecas2 * valorUnitarioPeca2;
		valorTotalAPagar = valorTotalPeca1 + valorTotalPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotalAPagar);
		
		sc.close();
	}

}

package orientacao.objetos.introducao.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import orientacao.objetos.introducao.exercicios.utils.CurrencyConverter;

public class ProgramCurrencyConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		System.out.printf("Amount to be paid in reais %.2f%n", CurrencyConverter.convert(dollars, dollarPrice));
		
		sc.close();
	}

}

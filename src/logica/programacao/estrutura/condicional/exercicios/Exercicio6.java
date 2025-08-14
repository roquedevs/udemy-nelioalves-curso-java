package logica.programacao.estrutura.condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor < 0 || valor > 100) {
			System.out.println("Fora do intervalo");
		}
		else if (valor <= 25) {
			System.out.println("Intervalor [0,25]");
		}
		else if (valor <= 50) {
			System.out.println("Intervalor [25,50]");
		}
		else if (valor <= 75) {
			System.out.println("Intervalor [50,75]");
		}
		else {
			System.out.println("Intervalor [75,100]");
		}
		
		sc.close();
	}

}

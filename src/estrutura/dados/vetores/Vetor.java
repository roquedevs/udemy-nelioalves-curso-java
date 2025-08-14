package estrutura.dados.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double total = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();
			total += vect[i];
		}
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", total / vect.length);
		
		sc.close();
	}

}

package estrutura.dados.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] >= 0) {
				continue;
			}
			System.out.println(vect[i]);
		}
		sc.close();
	}

}

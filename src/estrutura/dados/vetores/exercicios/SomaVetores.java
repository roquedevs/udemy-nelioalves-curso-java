package estrutura.dados.vetores.exercicios;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA, vectB, vectC;
		vectA = new int[n];
		vectB = new int[n];
		vectC = new int[n];

		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i<n; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i=0; i<n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i=0; i<n; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}

}

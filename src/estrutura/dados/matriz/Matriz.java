package estrutura.dados.matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] vect = new int[n][n];
		
		
		for (int i=0; i<vect.length; i++) {
			for (int j=0; j<vect[i].length; j++) {
				vect[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<vect.length; i++) {
			for (int j=0; j<vect[i].length; j++) {
				System.out.print(vect[i][j] + ",");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

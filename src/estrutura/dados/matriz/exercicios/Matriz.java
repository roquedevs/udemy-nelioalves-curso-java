package estrutura.dados.matriz.exercicios;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] matriz = new int[rows][cols];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int n = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == n) {
					System.out.printf("Position %d,%d:%n", i, j);
					if (j > 0) {
						System.out.printf("Left: %d%n", matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1) {
						System.out.printf("Right: %d%n", matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.printf("Up: %d%n", matriz[i - 1][j]);
					}
					if (i < matriz.length - 1) {
						System.out.printf("Down: %d%n", matriz[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}

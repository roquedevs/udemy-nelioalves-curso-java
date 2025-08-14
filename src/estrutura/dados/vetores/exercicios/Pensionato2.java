package estrutura.dados.vetores.exercicios;

import java.util.Scanner;

public class Pensionato2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<vect.length; i++) {
            if (vect[i] != null) {
            	System.out.printf("%d: %s%n", i, vect[i]);
            }
        }
		
		sc.close();
	}

}

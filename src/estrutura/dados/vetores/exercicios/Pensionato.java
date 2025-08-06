package estrutura.dados.vetores.exercicios;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] emails = new String[n];
		String[] names = new String[n];
		int[] rooms = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", (i+1));
			System.out.print("Name: ");
			names[i] = sc.nextLine();
			System.out.print("Email: ");
			emails[i] = sc.next();
			sc.nextLine();
			System.out.print("Room: ");
			rooms[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.println();
		System.out.println("Busy rooms:");
		
		// Bubble Sort
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-1-i; j++) {
				if (rooms[j] > rooms[j+1]) {
					// Change rooms
					int tempRoom = rooms[j];
					rooms[j] = rooms[j+1];
					rooms[j+1] = tempRoom;
					
					// Change names
					String tempName = names[j];
					names[j] = names[j+1];
					names[j+1] = tempName;
					
					// Change emails
					String tempEmail = emails[j];
					emails[j] = emails[j+1];
					emails[j+1] = tempEmail;
				}
			}
		}
		
		for (int i=0; i<n; i++) {
            System.out.printf("%d: %s, %s%n", rooms[i], names[i], emails[i]);
        }
		
		sc.close();
	}

}

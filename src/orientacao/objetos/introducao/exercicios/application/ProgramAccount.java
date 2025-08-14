package orientacao.objetos.introducao.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import orientacao.objetos.introducao.exercicios.entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
	
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			acc = new Account(number, holder, amount);
		}
		else {
			acc = new Account(number, holder);
		}
		
		System.out.println("\nAccount data:" + acc);
		
		System.out.print("Enter a deposit value: ");
		acc.deposit(sc.nextDouble());
		
		System.out.println("\nUpdated account data:" + acc);
		
		System.out.print("Enter a withdraw value: ");
		acc.withdraw(sc.nextDouble());
		
		System.out.println("\nUpdated account data:" + acc);
		
		sc.close();
	}

}

package orientacao.objetos.composicao.exercicios.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import orientacao.objetos.composicao.exercicios.entities.Department;
import orientacao.objetos.composicao.exercicios.entities.HourContract;
import orientacao.objetos.composicao.exercicios.entities.Worker;
import orientacao.objetos.composicao.exercicios.entities.enums.WorkerLevel;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		Department department = new Department(sc.next());
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.print("Base salary: ");
		double salary = sc.nextDouble();
		Worker worker = new Worker(name, level, salary, department);
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("Enter contract #%d data:%n", (i+1));
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println(worker);
		System.out.printf("Income for %s: %.2f%n", monthAndYear, worker.income(year, month));
		
		sc.close();
	}

}

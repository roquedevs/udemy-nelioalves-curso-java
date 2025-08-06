package estrutura.dados.lista.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Employee> employees = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d:%n", (i + 1));

			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employees.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee foundEmployee = employees.stream()
				.filter(e -> e.getId() == id)
				.findFirst()
				.orElse(null);
		if (foundEmployee != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			foundEmployee.increaseSalary(percentage);
		}
		else {
			System.out.println("This id does not exist! ");
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		sc.close();
	}
}

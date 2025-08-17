package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        BigDecimal salary = BigDecimal.valueOf(sc.nextDouble());
        System.out.printf("Email of people whose salary is more than %.2f%n:", salary);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], new BigDecimal(fields[2])));
                line = br.readLine();
            }

            employees.stream()
                    .filter(emp -> emp.getSalary().compareTo(salary) > 0)
                    .map(Employee::getEmail)
                    .sorted()
                    .forEach(System.out::println);

            BigDecimal sumSalary = employees.stream()
                    .filter(emp -> emp.getName().startsWith("M"))
                    .map(Employee::getSalary)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", sumSalary);
        } catch (IOException e) {
            System.out.println("Error opening file" + e.getMessage());
        }

        sc.close();
    }
}

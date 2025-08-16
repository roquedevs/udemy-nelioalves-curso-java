package interfaces.exercises.application;

import interfaces.exercises.model.entities.Contract;
import interfaces.exercises.model.entities.Installment;
import interfaces.exercises.model.services.ContractService;
import interfaces.exercises.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = fmt.parse(sc.next(), LocalDate::from);
        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, parcelas);

        System.out.println("Parcelas:");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}

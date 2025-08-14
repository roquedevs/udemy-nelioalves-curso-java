package interfaces.application;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;
import interfaces.model.services.BrazilTaxService;
import interfaces.model.services.RentalServiceSemInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = fmt.parse(sc.nextLine(), LocalDateTime::from);

        CarRental cr = new CarRental(new Vehicle(model), start, finish);

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalServiceSemInterface rentalServiceSemInterface = new RentalServiceSemInterface(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalServiceSemInterface.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.printf("Pagamento basico: %.2f%n", cr.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f%n", cr.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f%n", cr.getInvoice().getTotalPayment());

        sc.close();
    }
}

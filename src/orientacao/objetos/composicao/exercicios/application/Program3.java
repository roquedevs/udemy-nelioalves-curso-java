package orientacao.objetos.composicao.exercicios.application;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import orientacao.objetos.composicao.exercicios.entities.Client;
import orientacao.objetos.composicao.exercicios.entities.Order;
import orientacao.objetos.composicao.exercicios.entities.OrderItem;
import orientacao.objetos.composicao.exercicios.entities.Product;
import orientacao.objetos.composicao.exercicios.entities.enums.OrderStatus;
import orientacao.objetos.composicao.exercicios.utils.DateUtil;

public class Program3 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Order order;
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthdate = sc.nextLine();
		Client client = new Client(name, email, DateUtil.parseDate(birthdate));
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		OrderStatus orderStatus = OrderStatus.valueOf(status);

		System.out.print("How many items to this order? ");	
		int n = sc.nextInt();
		Date moment = new Date();
		
		order = new Order(moment, orderStatus, client);
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}

package orientacao.objetos.composicao.application;

import java.time.LocalDate;

import orientacao.objetos.composicao.entities.Order;
import orientacao.objetos.composicao.entities.enums.OrderStatus;

public class ProgramEnum {

	public static void main(String[] args) {
		
		Order order1 = new Order(1091, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order1);
		
		// Conversão de String para enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
	}

}

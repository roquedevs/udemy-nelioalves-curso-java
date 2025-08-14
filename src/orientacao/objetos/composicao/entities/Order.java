package orientacao.objetos.composicao.entities;

import java.time.LocalDate;

import orientacao.objetos.composicao.entities.enums.OrderStatus;

public class Order {

	private final Integer id;
	private final LocalDate moment;
	private final OrderStatus status;

	public Order(Integer id, LocalDate moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}

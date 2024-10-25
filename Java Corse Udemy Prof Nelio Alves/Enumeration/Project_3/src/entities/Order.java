package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	private LocalDateTime moment;
	private OrderStatus status;

	private List<OrderItem> itemList = new ArrayList<>();

	private Client client;

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public List<OrderItem> getItemList() {
		return itemList;
	}

	public Client getClient() {
		return client;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		itemList.add(item);
	}

	public void removeItem(OrderItem item) {
		itemList.remove(item);
	}

	public double totalPrice() {
		double sum = 0.0;
		for (OrderItem orderItem : itemList) {
			sum += orderItem.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(moment.format(formatter) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Orden items:\n");
		for (OrderItem orderItem : itemList) {
			sb.append(orderItem + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", totalPrice()));

		return sb.toString();
	}
}

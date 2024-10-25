package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");

		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birt date (dd/mm/yyyy): ");
		LocalDate birthDate = LocalDate.parse(sc.next(), formatterDate);

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(LocalDateTime.now(), status, client);

		System.out.println();
		System.out.print("How many items to this order? ");
		int itemsN = sc.nextInt();

		for (int i = 0; i < itemsN; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Product quantity: ");
			int productQuantity = sc.nextInt();

			Product product = new Product(productName, productPrice);

			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("Order Summary:");
		System.out.println(order);

		sc.close();

	}

}

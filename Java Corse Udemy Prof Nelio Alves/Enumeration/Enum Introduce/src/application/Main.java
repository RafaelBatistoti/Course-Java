package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
//													 Converted ENUM to String
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
//		Converted String to ENUM
		OrderStatus od1 = OrderStatus.DELIVERED;
		OrderStatus od2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(od1);
		System.out.println(od2);
		
		

	}

}

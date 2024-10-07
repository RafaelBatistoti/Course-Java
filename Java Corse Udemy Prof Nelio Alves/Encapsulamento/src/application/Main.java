package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner	sc		= new Scanner(System.in);

		System.out.println("Enter data");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");

		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + product);

		System.out.println();
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");

		int removeItem = sc.nextInt();

		product.removeProduct(removeItem);

		System.out.println();
		System.out.print("Updated data: " + product);

		sc.close();

	}

}

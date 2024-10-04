package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Scanner	sc		= new Scanner(System.in);
		Product	product	= new Product();

		System.out.println("Enter data");

		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		int quantityAdd = sc.nextInt();
		product.addProducts(quantityAdd);

		System.out.println();
		System.out.print("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int removeItem = sc.nextInt();

		product.removeProduct(removeItem);

		System.out.println();
		System.out.print("Updated data: " + product);

		sc.close();

	}

}

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dateTimeFomatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<Product> productList = new ArrayList<>();

		System.out.print("Enter number of product: ");
		int productNumber = sc.nextInt();

		for (int i = 0; i < productNumber; i++) {
			System.out.println();
			System.out.print("Product #" + (i + 1) + " data");
			System.out.print("Common, used or imported (c,u,i)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (resp == 'i') {

				System.out.print("Costoms Fee: ");
				double costomsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, costomsFee));

			}
			else if (resp == 'c') {
				productList.add(new Product(name, price));
			}
			else {
				System.out.print("Manufactured Data (dd/mm/yyyy): ");
				LocalDate manufacturedData = LocalDate.parse(sc.next(), dateTimeFomatted);
				productList.add(new UsedProduct(name, price, manufacturedData));

			}
		}

		System.out.println();
		System.out.println("PRICE TAG:");

		for (Product product : productList) {
			System.out.println(product.priceTag());
		}
		sc.close();

	}

}

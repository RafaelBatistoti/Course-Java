package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Compani;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> taxPayerList = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int taxPayersNumber = sc.nextInt();

		for (int i = 0; i < taxPayersNumber; i++) {
			System.out.println();
			System.out.print("Individual or Company (i/c): ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (resp == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				taxPayerList.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				taxPayerList.add(new Compani(name, anualIncome, numberOfEmployees));
			}
		}

		double totalTaxes = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID");
		for (TaxPayer taxPayer : taxPayerList) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			totalTaxes += taxPayer.tax();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		sc.close();

	}

}

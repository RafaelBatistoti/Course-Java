package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("What the dolar price? ");
		double dolarPrice = sc.nextDouble();

		System.out.print("How many dolars will be bought? ");
		double	real	= sc.nextDouble();

		double	percent	= CurrencyConverter.getPercentage(real, dolarPrice);
		
		double convert = CurrencyConverter.conversor(percent, real, dolarPrice);
		
		System.out.printf("Amount to be paid in reais = %.2f", convert);

		sc.close();

	}

	

}

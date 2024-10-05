package application;

import java.util.Scanner;

import util.Calculator;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double	radius	= sc.nextDouble();

		double	circum	= Calculator.circunference(radius);

		double	vol		= Calculator.volume(radius);

		System.out.printf("Circunference: %.2f%n", circum);
		System.out.printf("Valume: %.2f%n", vol);
		System.out.printf("PI: %.2f%n", Calculator.PI);

		sc.close();
	}

}

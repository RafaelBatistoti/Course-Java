package application;

import java.util.Scanner;

public class Main {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circum = circunference(radius);
		
		double vol = volume(radius);
		
		System.out.printf("Circunference: %.2f%n", circum);
		System.out.printf("Valume: %.2f%n", vol);
		System.out.printf("PI: %.2f%n", PI);
				
		sc.close();
	}
		
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius *radius *radius /3.0;
	}
	
}

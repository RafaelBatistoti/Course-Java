package applications;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}

		System.out.printf("SOMA = %.2f%n", soma);

		double avg = soma / vect.length;

		System.out.printf("Average = %.2f", avg);

		sc.close();

	}

}

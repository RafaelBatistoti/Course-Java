package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sun = 0.0;
		for (int i = 0; i < n; i++) {
			sun += vect[i];
		}

		double avg = sun / n;

		System.out.printf("Avarege: %.2f", avg);

		sc.close();

	}

}

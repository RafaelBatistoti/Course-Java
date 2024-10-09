package applications;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.printf("Números negativos: %d%n", vect[i]);
			}
		}

		sc.close();

	}

}

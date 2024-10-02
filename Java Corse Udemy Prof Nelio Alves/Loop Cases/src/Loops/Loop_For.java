package Loops;

import java.util.Scanner;

public class Loop_For {

	public static void main(String[] args) {

		Scanner	sc		= new Scanner(System.in);

		int		valor	= sc.nextInt();
		int		soma	= 0;

		for (int i = 0; i < valor; i++) {
			int nextNumber = sc.nextInt();
			soma += +nextNumber;

		}

		System.out.printf("O valor total dos números digitados é: %d", soma);

		sc.close();

	}

}

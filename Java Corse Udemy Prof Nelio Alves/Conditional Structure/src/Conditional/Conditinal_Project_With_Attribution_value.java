package Conditional;

import java.util.Scanner;

public class Conditinal_Project_With_Attribution_value {

	public static void main(String[] args) {

		Scanner	sc				= new Scanner(System.in);

		int		minute			= sc.nextInt();
		double	planStandart	= 50.00;

		if (minute <= 100) {
			System.out.printf("Valor a pagar R$ %.2f%n", planStandart);
		} else if (minute > 100) {
			planStandart += (minute - 100) * 2;
			System.out.printf("Valor a pagar R$ %.2f%n", planStandart);
		}
		sc.close();

	}

}

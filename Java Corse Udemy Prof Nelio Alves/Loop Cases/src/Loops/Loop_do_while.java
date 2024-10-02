package Loops;

import java.util.Scanner;

public class Loop_do_while {

	public static void main(String[] args) {

		Scanner	sc	= new Scanner(System.in);
		char	resp;

		do {
			System.out.print("Digite a temperatura en Celcius: ");
			double	C	= sc.nextDouble();
			Double	F	= 9.0 * C / 5.0 + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenhreit: %.2f%n", F);
			System.out.print("Deseja Repetir? (s/n): ");
			resp = sc.next().charAt(0);
			;

		} while (resp != 'n');

		sc.close();

	}

}

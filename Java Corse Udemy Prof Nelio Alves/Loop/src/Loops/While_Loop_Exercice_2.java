package Loops;

import java.util.Scanner;

public class While_Loop_Exercice_2 {

	public static void main(String[] args) {

		Scanner	sc				= new Scanner(System.in);

		int		entrada			= sc.nextInt();
		int		somaAlcool		= 0;
		int		somaGasolina	= 0;
		int		somaDiesel		= 0;

		while (entrada != 4) {

			if (entrada == 1) {
				somaAlcool += +1;

			} else if (entrada == 2) {
				somaGasolina += +1;

			} else if (entrada == 3) {
				somaDiesel += +1;
			}
			entrada = sc.nextInt();

		}

		System.out.println("Muito Obrigado");
		System.out.printf("Alcool: %d%n", somaAlcool);
		System.out.printf("Gasolina: %d%n", somaGasolina);
		System.out.printf("Disel: %d", somaDiesel);

		sc.close();

	}

}

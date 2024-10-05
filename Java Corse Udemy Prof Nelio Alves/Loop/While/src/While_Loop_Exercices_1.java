

import java.util.Scanner;

public class While_Loop_Exercices_1 {

	public static void main(String[] args) {

		Scanner	sc		= new Scanner(System.in);

		int		senha	= sc.nextInt();

		while (senha != 2022) {
			System.out.println("Senha incorreta!");
			senha = sc.nextInt();
		}

		System.out.println("Senha correta!");

		sc.close();

	}

}

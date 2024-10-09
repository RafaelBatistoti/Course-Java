package applications;

import java.util.Scanner;

import entities.Rent;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.print("How many roons will be rented? ");
		int rentNumber = sc.nextInt();

		for (int i = 1; i < rentNumber; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			vect[roomNumber] = new Rent(name, email); // Atribui valores dentro da posição indicada pelo user
		}

		System.out.println();
		System.out.println("Busy roons:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}

}

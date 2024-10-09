package application;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Account ac;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		String titularName = sc.next();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);

		System.out.println();
		if (resp == 'y' || resp == 'Y') {
			System.out.print("Enter initial deposit value: ");
			int initialDeposit = sc.nextInt();

			ac = new Account(accountNumber, titularName, initialDeposit);

			System.out.println("Updated account data: " + ac);

		}
		else {

			ac = new Account(accountNumber, titularName);
			System.out.println("Updated account data: " + ac);

		}

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();

		ac.deposit(deposit);

		System.out.println("Updated account data: " + ac);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();

		ac.withdraw(withdraw);

		System.out.println("Updated account data: " + ac);

		sc.close();

	}

}

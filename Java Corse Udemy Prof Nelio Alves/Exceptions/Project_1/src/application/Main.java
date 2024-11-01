package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountExceptions;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double InitialValue = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();

		Account account = new Account(numberAccount, holder, InitialValue, withdrawLimit);

		try {

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdrawValue = sc.nextDouble();

			account.withdraw(withdrawValue);

			System.out.println(account);
		}
		catch (AccountExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}

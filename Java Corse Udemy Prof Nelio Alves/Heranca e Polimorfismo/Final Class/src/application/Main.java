package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		Account account = new Account(1001, "Marcelo", 1000.0);
		account.withDraw(200.0);
		System.out.println(account.getBalance());
		
		Account saving = new SavingsAccount(1002, "Marcelo", 1000.0, 0.01);
		saving.withDraw(200.00);
		System.out.println(saving.getBalance());
		
		Account business = new BusinessAcount(1003, "Marcelo", 1000.0, 500.0);
		business.withDraw(200.00);
		System.out.println(business.getBalance());
	}

}

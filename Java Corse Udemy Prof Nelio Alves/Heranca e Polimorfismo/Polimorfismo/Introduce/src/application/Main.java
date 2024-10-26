package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		Account account = new Account(1001, "Marcelo", 1000.0);
		Account saving = new SavingsAccount(1002, "Marcelo", 1000.0, 0.01);
		
//		Polimorfismo é quando você usa os mesmo metódo 
//		Para trazer resultados diferentes
//		No caso "withDraw"
		account.withDraw(50.0);
		saving.withDraw(50.0);
		
		System.out.println(account.getBalance());
		System.out.println(saving.getBalance());
		
	}

}

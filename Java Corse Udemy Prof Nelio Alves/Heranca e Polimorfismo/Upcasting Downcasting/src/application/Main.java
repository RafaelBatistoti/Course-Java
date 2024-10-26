package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		Account        acount   = new Account(1001, "Marcelo", 0.0);
		BusinessAcount business = new BusinessAcount(1002, "Marcela", 0.0, 500.00);
		SavingsAccount savings  = new SavingsAccount(1002, "Marcola", 0.0, 500.00);

		Account ac1 = business; // Instanciando uma Account para o tipo BusinessAcount
		Account ac2 = savings;  // Instanciando uma Account para o tipo SavingsAccount

		Account ac3 = new BusinessAcount(1003, "Marcos", 0.0, 500.00); // Instanciando uma Account para o tipo BusinessAcount
																		// e passando argumentos
		Account ac4 = new SavingsAccount(1004, "Marcos", 0.0, 0.01);   // Instanciando uma Account para o tipo
																		// SavisngsAccount e passando argumentos

		BusinessAcount ac5 = (BusinessAcount) ac3; // Instanciando uma BusinessAcount para o tipo Account.
		SavingsAccount ac6 = (SavingsAccount) ac4; // Instanciando uma SavingsAccount para o tipo Account.

	}

//	No exemplo que temos, um Upcasting � quando eu inst�ncio uma Account, que � minha super classe, para o tipo Bussines e Savings Account
//	Downcasting � quando eu instancio Bussines e Savings Account para o tipo Account, sendo que Account � minha super class
//	Agora, eu n�o posso instanciar uma Bussines para Savings e vice-versa ou seja n�o poss�vel ter uma rela��o entre subClasse e SubClasses
//	Nesse caso ocorer� um erro, po�m, em tempo de execu��o

}

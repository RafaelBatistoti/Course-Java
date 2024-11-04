package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Main {

	public static void main(String[] args) {

//		Formatação da data para dd/mm/yyyy
		DateTimeFormatter dataFormate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do contrato:");
		System.out.println();
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/mm/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), dataFormate);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();

		Contract contrato = new Contract(number, data, contractValue);

		System.out.print("Entre com o número de parecelas: ");
		int numberInstallment = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processingContract(contrato, numberInstallment);

		System.out.println();
		System.out.println("PARCELAS: ");
		for (Installment installment : contrato.getInstallmentList()) {
			System.out.println(installment);
		}

		sc.close();

	}

}

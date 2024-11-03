package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrazilianTaxService;
import model.service.RentalService;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do aluguel:");
		System.out.println();
		System.out.print("Modelo do carro: ");
		String modelCar = sc.nextLine();
		System.out.print("Retirada (DD/mm/yyyy HH:mm): ");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), dateFormatter);
		System.out.print("Retorno (DD/mm/yyyy HH:mm): ");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), dateFormatter);

		CarRental carRental = new CarRental(retirada, retorno, new Vehicle(modelCar));

		System.out.print("Enter com o preço por hora: ");
		Double hourPrice = sc.nextDouble();
		System.out.print("Enter com o preço por dia: ");
		Double hourDay = sc.nextDouble();

		RentalService rentalService = new RentalService(hourDay, hourPrice, new BrazilianTaxService());

		rentalService.processingInvoice(carRental);

		System.out.println();
		System.out.println("FATURA:");
		System.out.print("Pagamento básico: " 	+ String.format("%.2f", carRental.getInvoice().getBasicPaymment())  + "\n");
		System.out.print("Imposto: " 			+ String.format("%.2f", carRental.getInvoice().getTax()) + "\n");
		System.out.print("Pagamento total: " 	+ String.format("%.2f", carRental.getInvoice().totalPaymment()));

		sc.close();

	}

}

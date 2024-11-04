package model.service;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;

	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay  = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService   = taxService;
	}

	public void processingInvoice(CarRental carRental) {

		double minutes       = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double fractionHours = minutes / 60.0;

		double basicPaymment = fractionHours <= 12.0 ? pricePerHour * Math.ceil(fractionHours)
				: pricePerDay * Math.ceil(fractionHours / 24.0);

		double tax = taxService.tax(basicPaymment);

		carRental.setInvoice(new Invoice(basicPaymment, tax));
	}

}

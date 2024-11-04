package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter dataFormate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate date;
	private Double amount;
	
	public Installment(LocalDate date, Double amount) {
		super();
		this.date   = date;
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return date.format(dataFormate) + " - " + String.format("%.2f", amount);
	}
	
	
	
}

package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate manufacturedTime;
	

	public UsedProduct(String name, Double price, LocalDate manufacturedTime) {
		super(name, price);
		this.manufacturedTime = manufacturedTime;
	}

	public LocalDate getManufacturedTime() {
		return manufacturedTime;
	}

	public void setManufacturedTime(LocalDate manufacturedTime) {
		this.manufacturedTime = manufacturedTime;
	}
	
	public String convertDate(LocalDate manufacturedTime) {
		return manufacturedTime.format(dateFormatter);
	}

	@Override
	public String priceTag() {
		return super.getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice()) 
				+ " (Manufactured date: "
				+ convertDate(manufacturedTime) + ")";
	}

}

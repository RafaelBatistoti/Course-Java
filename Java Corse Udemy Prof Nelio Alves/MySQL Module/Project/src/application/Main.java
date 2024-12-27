package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter dateTimeFomatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Department obj = new Department(1, "Books");
		
		LocalDate birthDate = LocalDate.parse("02/03/1992", dateTimeFomatted);
		
		Seller sl = new Seller(1, "Rafael", "rafael@gmail.com", birthDate , 2000.0, obj);
		
		System.out.println(sl);

	}

}

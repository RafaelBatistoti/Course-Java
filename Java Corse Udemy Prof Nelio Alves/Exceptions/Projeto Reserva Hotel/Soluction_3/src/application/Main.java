package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the room number: ");
			int roonNumber = sc.nextInt();
			System.out.print("CheckIn: ");
			LocalDate CheckInDate = LocalDate.parse(sc.next(), formatterDate);
			System.out.print("CheckOut: ");
			LocalDate   CheckOutDate = LocalDate.parse(sc.next(), formatterDate);
			Reservation reservation  = new Reservation(roonNumber, CheckInDate, CheckOutDate);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("CheckIn: ");
			CheckInDate = LocalDate.parse(sc.next(), formatterDate);
			System.out.print("CheckOut: ");
			CheckOutDate = LocalDate.parse(sc.next(), formatterDate);
			reservation.updateDates(CheckInDate, CheckOutDate);
			System.out.println("Reservation: " + reservation);
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		finally {
			sc.close();
		}

		

	}

}

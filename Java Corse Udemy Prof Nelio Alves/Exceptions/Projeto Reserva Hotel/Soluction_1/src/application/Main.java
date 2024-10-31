package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the room number: ");
		int roonNumber = sc.nextInt();

		System.out.print("CheckIn: ");
		LocalDate CheckInDate = LocalDate.parse(sc.next(), formatterDate);

		System.out.print("CheckOut: ");
		LocalDate CheckOutDate = LocalDate.parse(sc.next(), formatterDate);

		if (CheckInDate.isAfter(CheckOutDate)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(roonNumber, CheckInDate, CheckOutDate);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");

			System.out.print("CheckIn: ");
			CheckInDate = LocalDate.parse(sc.next(), formatterDate);

			System.out.print("CheckOut: ");
			CheckOutDate = LocalDate.parse(sc.next(), formatterDate);

			LocalDate currentDate = LocalDate.now();
			if (CheckInDate.isBefore(currentDate) || CheckOutDate.isBefore(currentDate)) {
				System.err.println("Error in reservation: Reservation dates for update must be future dates");
			}
			else if (CheckInDate.isAfter(CheckOutDate)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			else {

				reservation = new Reservation(roonNumber, CheckInDate, CheckOutDate);
				System.out.println("Reservation: " + reservation);
			}

		}

		sc.close();

	}

}

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter departament's name: ");
		String departamentName = sc.nextLine();
		System.out.println("Enter work data:");
		System.out.println();
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Departament(departamentName));

		System.out.println();
		System.out.print("How many contracts to this worker: ");
		int contractNumbers = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < contractNumbers; i++) {
			System.out.println();
			System.out.print("Enter contract#" + (i + 1) + " data:");
			System.out.println();
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate contractDate = LocalDate.parse(sc.next(), dateFormatter);
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);

		}
		System.out.println();
		System.out.println("Enter month and year to calculate: ");
		String monthYear = sc.next();
		int    month     = Integer.parseInt(monthYear.substring(0, 2));
		int    year      = Integer.parseInt(monthYear.substring(3));

		System.out.println(
				worker + "\n" + "Income for: " + monthYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}
}

package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutedSurced;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> listEmployee = new ArrayList<Employee>();

		System.out.print("Enter the number of employee: ");
		int employeeNumber = sc.nextInt();

		for (int i = 0; i < employeeNumber; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + " data");
			System.out.print("Outsurced (y/n)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hour: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (resp == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

//				Refaturando código      
				listEmployee.add(new OutedSurced(name, hour, valuePerHour, additionalCharge));
			}
			else {
				listEmployee.add(new Employee(name, hour, valuePerHour));
			}

		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : listEmployee) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}
		sc.close();

	}

}

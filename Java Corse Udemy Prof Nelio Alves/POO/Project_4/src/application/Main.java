package application;

import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {

		Scanner	sc		= new Scanner(System.in);

		Student	student	= new Student();

		System.out.print("Name: ");
		student.name = sc.nextLine();

		System.out.print("Nota do primeiro semestre: ");
		student.note1 = sc.nextDouble();

		System.out.print("Nota do segundo semestre: ");
		student.note2 = sc.nextDouble();

		System.out.print("Nota do terceiro semestre: ");
		student.note3 = sc.nextDouble();

		System.out.println("FINAL GRADE = " + student);

		if (student.sunNote() < 60.0) {
			System.out.println("FAILED");
			System.out.print("MISSING: " + String.format("%.2f", student.missingPoits())  + " POINTS");
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}

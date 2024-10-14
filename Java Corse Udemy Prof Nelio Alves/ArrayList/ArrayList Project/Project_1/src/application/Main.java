package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas reservas? ");
		int n = sc.nextInt();

		List<Employee> listEmployee = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);

			listEmployee.add(employee);

		}

		System.out.print("Aumento vai pra quem? ");
		int     idSalary = sc.nextInt();
		Integer pos      = position(listEmployee, idSalary);
		if (pos == null) {
			System.out.println("Não existe ID!!");
		}
		else {
			System.out.print("Qual porcentagem? ");
			double percent = sc.nextDouble();
			
//			Para add o aumento de salário
//			Eu preciso acessar a posição encontrada anteriormente
//			pra dai chamar o methodo "increaseSalary"
			listEmployee.get(pos).increaseSalary(percent);
		}

		
		System.out.println();
		System.out.println("Lista de funcionários");
		for (Employee emp : listEmployee) {
			System.out.println(emp);
		}
		
		sc.close();

	}

	private static Integer position(List<Employee> listEmployee, int idSalary) {

		for (int i = 0; i < listEmployee.size(); i++) {

			// Se na posição o id que foi passado anteriormente
			// For igual ao id que passou agora
			// Ele retorna a POSIÇÃO list
			// Se não retorna null

			if (listEmployee.get(i).getId() == idSalary) {
				return i;
			}
		}

		return null;
	}

}

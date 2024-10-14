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
			System.out.println("N�o existe ID!!");
		}
		else {
			System.out.print("Qual porcentagem? ");
			double percent = sc.nextDouble();
			
//			Para add o aumento de sal�rio
//			Eu preciso acessar a posi��o encontrada anteriormente
//			pra dai chamar o methodo "increaseSalary"
			listEmployee.get(pos).increaseSalary(percent);
		}

		
		System.out.println();
		System.out.println("Lista de funcion�rios");
		for (Employee emp : listEmployee) {
			System.out.println(emp);
		}
		
		sc.close();

	}

	private static Integer position(List<Employee> listEmployee, int idSalary) {

		for (int i = 0; i < listEmployee.size(); i++) {

			// Se na posi��o o id que foi passado anteriormente
			// For igual ao id que passou agora
			// Ele retorna a POSI��O list
			// Se n�o retorna null

			if (listEmployee.get(i).getId() == idSalary) {
				return i;
			}
		}

		return null;
	}

}

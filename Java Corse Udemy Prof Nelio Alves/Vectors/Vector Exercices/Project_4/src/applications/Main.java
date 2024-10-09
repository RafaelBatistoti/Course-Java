package applications;

import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numPessoas;

		System.out.print("Quantas pessoas serao digitadas? ");
		numPessoas = sc.nextInt();
		Pessoa[] vect = new Pessoa[numPessoas];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Pessoa(name, idade, altura);
		}

		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getHigher();
		}

		double avg = soma / vect.length;

		System.out.printf("Altura média: %.2f%n", avg);

		int numMenores16 = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				numMenores16++;
			}
		}

		double percentualMenores = (numMenores16 / vect.length) * 100;

		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", percentualMenores);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();

	}

}

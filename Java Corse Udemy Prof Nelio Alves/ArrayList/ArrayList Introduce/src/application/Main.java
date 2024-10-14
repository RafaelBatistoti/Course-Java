package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> listNames = new ArrayList<>();

		listNames.add("Maria");
		listNames.add("Pedro");
		listNames.add("Mariano");
		listNames.add(2, "Mariana"); // Sobrecarca para add um novo valor na posição 2

		System.out.println("Tamanho da lista: " + listNames.size());

		for (String list : listNames) {
			System.out.println(list);
		}

		System.out.println("-------------------------------");
		System.out.println("Display apenas os nomes com a letra 'M'");
		List<String> novaListaNomes = listNames.stream().filter(nomes -> nomes.charAt(0) == 'M').collect(Collectors.toList());

		System.out.println("Tamanho da lista: " + novaListaNomes.size());

		for (String list : novaListaNomes) {
			System.out.println(list);
		}
		
		System.out.println("-------------------------------");
		System.out.println("Remove o index 0 da list");
		listNames.remove(0);

		System.out.println("Tamanho da lista: " + listNames.size());

		for (String list : listNames) {
			System.out.println(list);
		}

		System.out.println("-------------------------------");
		System.out.println("Remove o todos os nomes com 'M' da list usando Lambda");
		listNames.removeIf(nomes -> nomes.charAt(0) == 'M');

		System.out.println("Tamanho da lista: " + listNames.size());

		for (String list : listNames) {
			System.out.println(list);
		}
		
		

	}

}

package application;

import entities.Client;

public class Main {

	public static void main(String[] args) {

		Client client1 = new Client("Rafael", "rafael@gmail.com");
		Client client2 = new Client("Rafael", "rafael@gmail.com");

		System.out.print("Hash: " + client1.hashCode() + "\n");
		System.out.print("Hash: " + client2.hashCode() + "\n");
		System.out.print("Equals: " + client1.equals(client2) + "\n");
		System.out.print(client1 == client2);

	}

}

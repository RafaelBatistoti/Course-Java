package com.Singleton;

public class App {
	public static void main(String[] args) {

		Config	conn1	= Config.getInstance();
		Config	conn2	= Config.getInstance();

		if (conn1 == conn2)
			System.out.println("Singleton Funciona");
		else
			System.out.println("Singleton não funciona");

	}
}

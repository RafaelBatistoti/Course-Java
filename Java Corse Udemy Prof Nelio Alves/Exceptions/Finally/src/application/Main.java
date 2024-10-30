package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File    file = new File("C:\\Users\\RafaelBatistoti\\Documents\\ws-java\\Java Course Origin\\Java Corse Udemy Prof Nelio Alves\\Exceptions\\Finally\\in.txt");
		Scanner sc   = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
//		O finally é uma ação que independente do erro ou se deu certo
//		Ela precisa ser executada no fianal
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}

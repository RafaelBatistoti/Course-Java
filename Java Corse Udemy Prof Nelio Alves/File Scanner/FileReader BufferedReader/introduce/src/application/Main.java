package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String pathName = "in.txt";

		BufferedReader bf = null;

		try {

			bf = new BufferedReader(new FileReader(pathName));

			String line = bf.readLine(); 	// Lê o arquivo até o final.
										 	// Caso ele leia uma linha vazia vai ocorrer valores nulos

			while (line != null) { 			// Condição para ir lendo até ser diferente de nullo
				System.out.println(line); 	// Iprime a linha
				line = bf.readLine(); 		// Pega a próxima linha
			}

		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			try {
				if (bf != null) {
					bf.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}

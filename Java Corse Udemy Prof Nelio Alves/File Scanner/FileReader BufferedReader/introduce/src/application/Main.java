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

			String line = bf.readLine(); 	// L� o arquivo at� o final.
										 	// Caso ele leia uma linha vazia vai ocorrer valores nulos

			while (line != null) { 			// Condi��o para ir lendo at� ser diferente de nullo
				System.out.println(line); 	// Iprime a linha
				line = bf.readLine(); 		// Pega a pr�xima linha
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

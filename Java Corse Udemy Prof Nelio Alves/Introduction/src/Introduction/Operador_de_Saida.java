package Introduction;

import java.util.Locale;

public class Operador_de_Saida {

	public static void main(String[] args) {
		
		/*
		 	%f = ponto flutuante
			%d = inteiro
			%s = texto
			%n = quebra de linha		 
		 */
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s,  which price is $ %.2f%n", product1, price1);
		System.out.printf("%s,  which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record %d years old, code %s and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue e with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(new Locale("pt", "BR"));
		System.out.printf("BR decimal point: %.3f%n", measure);
	}

}

import java.util.Locale;

public class Comandos_de_Saida {

	public static void main(String[] args) {
		
		
		/*Variaveis de ponto flutuante
		  	
		  	%f = ponto flutuante
			%d = inteiro
			%s = texto
			%n = quebra de linha
		 
			String nome = "Maria";
			int idade = 31;
			double renda = 4000.0;
			System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		 */
		
		//Exercícios
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf(product1 + ", witch price is $ %.2f%n", price1);
		System.out.printf(product2 + ", witch price is $ %.2f%n", price2);
		System.out.printf("Record: %d years old, code %s, and gender: %c%n",age, code, gender );
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(new Locale("pt", "BR"));
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);

	}

}

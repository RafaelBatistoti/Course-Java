package Conditional;

public class Conditional_Ternary {

	public static void main(String[] args) {
		
		double price = 19.5;;
		double descount = price <20.0 ? price *0.1 : price * 0.05;
		
		System.out.printf("O Valor do desconto foi %.2f", descount);	
	}

}

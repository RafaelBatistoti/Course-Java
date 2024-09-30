package Introduction;

import java.util.Scanner;

public class Entrada_de_Dados_com_Scanner {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String s; int i; double d; char c;
		 * 
		 * s = sc.next(); i = sc.nextInt(); d = sc.nextDouble(); c =
		 * sc.next().charAt(0); // O código "charAt(0)" pega a primeira letra da String
		 * digitada
		 * 
		 * System.out.printf("Você digitou String: %s%n", s);
		 * System.out.printf("Você digitou Int: %d%n", i);
		 * System.out.printf("Você digitou Double: %.2f%n", d);
		 * System.out.printf("Você digitou temo como o Char ser: %c", c);
		 * 
		 * sc.close();
		 */
		
//		 Using "nextLine()" method

		Scanner	sci	= new Scanner(System.in);

		int		x;
		String	s1, s2, s3;

		x = sci.nextInt();
//		sci.nextLine();  	//This method is responsible to keep the Enter keyboard value.
							//If remove this method the Enter keyboard value will be keeped in the "s1" variable 
		s1 = sci.nextLine();
		s2 = sci.nextLine();
		s3 = sci.nextLine();

		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}

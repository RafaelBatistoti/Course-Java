

import java.util.Scanner;

public class Loop_For_Exercices_1 {

	public static void main(String[] args) {

		Scanner	sc	= new Scanner(System.in);

		int		N	= sc.nextInt();
		int		out	= 0;
		int		in	= 0;

		for (int i = 0; i < N; i++) {
			int newValue = sc.nextInt();
			if (newValue >= 10 && newValue <= 20) {
				in += +1;
			} else {
				out += +1;
			}

		}

		System.out.println("In: " +  in);
		System.out.println("Out: " +  out);
		sc.close();

	}

}

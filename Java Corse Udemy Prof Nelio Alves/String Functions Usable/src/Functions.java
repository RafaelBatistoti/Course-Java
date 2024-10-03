import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {

		Scanner	sc		= new Scanner(System.in);

		int		a		= sc.nextInt();
		int		b		= sc.nextInt();
		int		c		= sc.nextInt();

		int		higher	= max(a, b, c);

		showCase(higher);

		sc.close();

	}

	public static void showCase(int result) {
		System.out.printf("O maior é: %d ", result);
	}

	public static int max(int a, int b, int c) {
		int aux;

		if (a > b && a > c) {
			aux = a;
		} else if (b > a && b > c) {
			aux = b;
		} else {
			aux = c;
		}

		return aux;

	}

}

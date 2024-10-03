package application;
import java.util.Scanner;

public class Problem_Without_POO {

	public static void main(String[] args) {

		Scanner	sc	= new Scanner(System.in);

		double	xA, xB, xC, yA, yB, yC;

		System.out.println("Enter with measures of triangule X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Enter with measures of triangule Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double	p		= (xA + xB + xC) / 2.0;
		double	areaX	= Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larege area is: X");
		} else
			System.out.println("Larege area is: Y");

		sc.close();

	}

}

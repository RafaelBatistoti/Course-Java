package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> shapeList = new ArrayList<>();
		;
		System.out.print("Enter the number of shapes: ");
		int numberShapes = sc.nextInt();

		for (int i = 0; i < numberShapes; i++) {
			System.out.println();
			System.out.println("Shape #" + (i + 1) + " data: ");
			System.out.print("Rectangle or Circle (r/c): ");
			char resp = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (resp == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();

				shapeList.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				shapeList.add(new Circle(color, radius));

			}

		}

		System.out.println("SHAPE AREA:");
		for (Shape shape : shapeList) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		sc.close();

	}

}

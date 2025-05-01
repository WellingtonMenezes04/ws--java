package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the numbers of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char c = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());

			if (c == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Shape sha = new Rectangle(color, width, height);
				list.add(sha);

			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape sha = new Circle(color, radius);
				list.add(sha);
			}

		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape x : list) {
			System.out.println(String.format("%.2f", x.area()));

		}

		sc.close();
	}

}

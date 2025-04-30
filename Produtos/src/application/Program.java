package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (c == 'c') {
				Product pro = new Product(name, price);
				list.add(pro);
			} else if (c == 'i') {

				System.out.print("Customs free: ");
				double customsFree = sc.nextDouble();
				Product pro = new ImportedProduct(name, price, customsFree);
				list.add(pro);
			} else if (c == 'u') {
				System.out.print("Manufacture date: (DD/MM/YYYY)");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product pro = new UsedProduct(name, price, manufactureDate);
				list.add(pro);

			}

		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for (Product x : list) {
			System.out.println(x.priceTag());
		}

		sc.close();
	}

}

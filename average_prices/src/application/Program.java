package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double sum = 0.0;
			
			int n = sc.nextInt();
			
			Product[] vect = new Product[n];
			
			for(int i = 0; i < vect.length ;i++ ) {
					sc.nextLine();
					String name = sc.nextLine();
					double price = sc.nextDouble();
					
					vect[i] = new Product(name, price);
					
					sum += vect[i].getPrice();
					
			}
				
			double avg = sum/n;
			
			System.out.printf("AVEREGE PRICE: %.2f%n ", avg);
			
		
			sc.close();
	}

}

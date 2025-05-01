package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double amount = sc.nextDouble();
			if (c == 'i') {
				System.out.println("Health expenditures: ");
				double healthcare = sc.nextDouble();
				Pessoa ps = new PessoaFisica(name, amount, healthcare);
				list.add(ps);
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				Pessoa ps = new PessoaJuridica(name, amount, employees);
				list.add(ps);

			}

		}

		System.out.println();
		System.out.println("TAXES PAID");
		
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getName()+": $ "+ String.format("%.2f", pessoa.payment()));
		}
		

		sc.close();
	}

}

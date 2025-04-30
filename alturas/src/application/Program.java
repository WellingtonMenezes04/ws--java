package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double menores = 0;
		double sum_height = 0;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Pessoa[] vet = new Pessoa[n];

		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();

			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vet[i] = new Pessoa(name, idade, altura);

			sum_height += vet[i].getAltura();

			if (vet[i].getIdade() < 16) {

				menores += 1;
			}
		}

		double pct = (menores / n) * 100.0;

		double avg = sum_height / n;

		System.out.printf("Altura média: %.2f%n", avg);

		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", pct);

		for (int j = 0; j < vet.length; j++) {
			if (vet[j].getIdade() < 16) {

				System.out.println(vet[j].getName());
			}

		}

	}

}

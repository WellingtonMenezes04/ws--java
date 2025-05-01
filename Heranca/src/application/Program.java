package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new BussinesAccount(1002, "Maria", 1000.0 , 0.01);
		Account acc3 = new SavingsAccount(1003, "Bob", 1000.0, 500.00);
				
			
		sc.close();
	}

}

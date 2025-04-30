package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int[][] mat = new int[x][x];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				mat[i][j] = sc.nextInt();
			}

		}

		System.out.println("Main diagonal: ");

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if(mat[i][j] == mat[i][i]) {
					System.out.print(mat[i][j]+" ");
				}
			}

		}
		
		System.out.println("Negative numbers");
		
		for(int i = 0; i < x;i++) {
    		for(int j = 0;j <x;j++) {
    				if(mat[i][j] < 0) {
    					System.out.print(mat[i][j]);
    				}
    		}
	
    }

		sc.close();
	}

}

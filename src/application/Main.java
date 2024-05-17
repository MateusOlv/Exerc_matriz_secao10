package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the number of lines: ");
		int m = sc.nextInt();
		System.out.print("Type the number of columns: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Type a number: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.printf("\nPosition %d, %d:\n", i, j);
					if(j > 0) System.out.println("Left side number: " + mat[i][j-1]);
					if(j < mat[i].length - 1) System.out.println("Right side number: " + mat[i][j+1]);
					if(i > 0) System.out.println("Number above: " + mat[i-1][j]);
					if(i < mat.length - 1) System.out.println("Number below: " + mat[i+1][j]);
				}	
			}
		}
		
		System.out.println();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " "); 
			}
			System.out.println();
		}
		
		sc.close();
	}

}

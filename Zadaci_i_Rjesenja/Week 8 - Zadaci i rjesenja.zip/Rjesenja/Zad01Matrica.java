

import java.util.Scanner;

public class Zad01Matrica {
	
	/*
	 * metoda za generesinje i stampanje matrice n*n
	 * ciji su elementi nasumicno generisane nule ili jedinice
	 */
	public static void printMatrix(int n) {
		
		//deklarisanje matrice ciji je broj redova i broj kolona jednak broju n
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				matrix[i][j] = (int) (Math.random() * 2);//dodjeljivanje 0 ili 1 elementu matrice
				System.out.print(matrix[i][j] + " ");//stampanje elemenata matrice
			}
			
			System.out.println();//prelazak u novi red
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite duzinu kvadratne matrice: ");
		int n = input.nextInt();//duzina matrice
		input.close();
		
		printMatrix(n);//pozivanje metode za stampanje matrice
	}

}


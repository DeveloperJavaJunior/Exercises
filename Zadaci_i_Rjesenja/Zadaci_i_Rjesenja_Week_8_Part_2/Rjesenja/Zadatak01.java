package week08_2;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj redova i broj kolona: ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		int[][] matrix = new int[rows][columns];
		System.out.println("Unesite elemente " + rows + "x" + columns
				+ " matrice: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		
		in.close();
		
		System.out.println("Suma negativnih elemenata matrice: " + sum(matrix));

	}

	public static int sum(int[][] m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0) {
					sum += m[i][j];
				}
			}
		}

		return sum;
	}

}

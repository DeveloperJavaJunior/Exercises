package week08_2;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[4][4];
		System.out.println("Unesite elemente 4x4 matrice: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();

		System.out.println("Suma elemenata iznad glavne dijagonale: "
				+ sumAboveMainDiagonal(matrix));
	}

	public static int sumAboveMainDiagonal(int[][] m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j > i) {
					sum += m[i][j];
				}
			}
		}

		return sum;
	}

}

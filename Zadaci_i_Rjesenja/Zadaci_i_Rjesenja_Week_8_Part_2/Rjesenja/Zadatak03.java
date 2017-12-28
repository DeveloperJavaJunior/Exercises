package week08_2;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		System.out.println("Unesite elemente 3x3 matrice: ");
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		System.out.println("Broj elemenata vecih od 3: "
				+ countGreaterThan3(matrix));
	}

	public static int countGreaterThan3(int[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 3) {
					count++;
				}
			}
		}

		return count;
	}
}

package week08_2;

import java.util.Scanner;

public class Zadatak07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (1 + Math.random() * 9);
			}
		}
		in.close();
		printMatrix(matrix);

		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					if (matrix[i][j] % 2 == 0) {
						countEven++;
					} else {
						countOdd++;
					}
				}
			}
		}

		System.out.println("Broj parnih elemenata u glavnoj dijagonali: "
				+ countEven);
		System.out.println("Broj neparnih elemenata u glavnoj dijagonali: "
				+ countOdd);

	}

	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

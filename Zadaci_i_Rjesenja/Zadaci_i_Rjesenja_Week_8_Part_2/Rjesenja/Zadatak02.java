package week08_2;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj redova i broj kolona: ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		in.close();
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (10 + Math.random() * 90);
			}
		}

		printMatrix(matrix);
		System.out.println("Suma neparnih elemenata matrice: " + sum(matrix));
	}

	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int sum(int[][] m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] % 2 != 0) {
					sum += m[i][j];
				}
			}
		}

		return sum;
	}

}

package day_4;

public class Zadatak_1 {

	public static void main(String[] args) {

		/*
		 * int[][] matrix = new int[][];
		 * int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}}; matrix.length;
		 * matrix[2].length;
		 */

		int[][] matrix = new int[3][3];

		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.println(" Unesite:" + matrix.length + " reda i"
				+ matrix[0].length + "kolone:");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = in.nextInt();
			}

		}

		in.close();

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

	}
}

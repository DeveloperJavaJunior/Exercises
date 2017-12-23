package day_4;

public class Zadatak_4 {

	public static void main(String[] args) {

		int[][] matrix = new int[3][3];
		int sum = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = (int) (Math.random() * 10);

			}

		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");

				sum += matrix[row][col];
			}
			System.out.println();

		}
		System.out.print(" Suma svih elemenata u  2D nizu je:" + sum);

	}
}

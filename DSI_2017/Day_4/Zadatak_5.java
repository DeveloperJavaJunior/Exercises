package day_4;

public class Zadatak_5 {

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];

		printMatrix(matrix);

	}

	public static void printMatrix(int matrix[][]) {

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = (int) (Math.random() * 10);

			}

		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}
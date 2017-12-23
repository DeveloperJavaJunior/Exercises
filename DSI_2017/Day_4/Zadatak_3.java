package day_4;

public class Zadatak_3 {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Unesite broj redova i broj kolona:");
		int row = in.nextInt();
		int col = in.nextInt();

		int[][] matrix = new int[row][col];

		for (row = 0; row < matrix.length; row++) {
			for (col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = (int) (Math.random() * 10);
			}

		}

		in.close();

		for (row = 0; row < matrix.length; row++) {
			for (col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

	}

}

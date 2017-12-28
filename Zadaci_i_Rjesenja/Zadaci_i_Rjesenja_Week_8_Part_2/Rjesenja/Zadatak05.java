package week08_2;


public class Zadatak05 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (1 + Math.random() * 9);
			}
		}
		printMatrix(matrix);

		System.out.println("Proizvod elemenata ispod glavne dijagonale: "
				+ productBelowMainDiagonal(matrix));
	}

	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int productBelowMainDiagonal(int[][] m) {
		int product = 1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j < i) {
					product *= m[i][j];
				}
			}
		}

		return product;
	}

}

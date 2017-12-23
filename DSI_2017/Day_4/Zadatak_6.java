package day_4;

public class Zadatak_6 {

	public static void main(String[] args) {
		
		
		int[][] matrix = new int[5][5];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = (int) (Math.random() * 10);

			}

		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
		

	}}}
	public static int sumDiagonal(int[][] matrix) {
		
		int sum = 0;
		
		for(int i = 0; i < matrix.length; i++){
			sum += matrix[i][i];
		}
		return sum;
		
		
	}

}

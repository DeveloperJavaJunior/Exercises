
public class Task2SumTheMajorDiagonalSecondMethod {

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;

		for (int row = 0; row < m.length; row++) {
			sum += m[row][row];
		}
		return sum;
	}

	public static void main(String[] args) {
		double[][] matrix = new double[4][4];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter a 4-by-4 matrix row by row:");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = input.nextDouble();
			}
		}
		input.close();
		System.out.print(" Sum of the elements in the major diagonal is:" + sumMajorDiagonal(matrix));
	}
}
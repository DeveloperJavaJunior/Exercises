public class Task5AlgebraAddTwoMatricesFirstMethod {

	private static String addMatrix;

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];

		System.out.print(" Enter matrix1:");

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				a[row][col] = input.nextDouble();

			}
		}
		System.out.print(" Enter matrix2:");

		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[0].length; col++) {
				b[row][col] = input.nextDouble();
			}
			System.out.println(" The matrices are added as follows");
			double[][] c = addMatrix(a, b);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.printf("%7.2f", c[i][j]);
				}
			}
		}
		input.close();
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];

		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[0].length; col++) {
				c[row][col] += a[row][col] + b[row][col];
			}
		}
		return c;
	}

}
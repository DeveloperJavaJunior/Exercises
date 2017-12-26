public class Task6AlgebraMultiplyTwoMatricesSecondMethod {

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				c[i][j] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] *= a[i][k] * b[j][k];
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {

				System.out.printf("a[%d][%d]=", i, j);
				a[i][j] = input.nextDouble();
			}

		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {

				System.out.printf("b[%d][%d]=", i, j);
				b[i][j] = input.nextDouble();

			}
		}
		if (a[0].length != b.length)
			System.out.println("Matrixs dont multiply!");
		else {
			double[][] c = multiplyMatrix(a, b);

			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[0].length; j++) {
					System.out.printf("%7.2f", c[i][j]);

				}
			}
			input.close();
			System.out.println();
		}
	}
}

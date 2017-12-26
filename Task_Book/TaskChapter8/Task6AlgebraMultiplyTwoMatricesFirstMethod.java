public class Task6AlgebraMultiplyTwoMatricesFirstMethod {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		double[][] a = new double[3][3];
		double[][] b = new double[3][3];

		System.out.print(" Enter matrix1:");

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[0].length; c++) {
				a[r][c] = input.nextDouble();
			}
		}
		System.out.print(" Enter matrix2:");

		for (int g = 0; g < b.length; g++) {
			for (int d = 0; d < b[0].length; d++) {
				b[g][d] = input.nextDouble();
			}
		}
		multiplyMatrix(a, b);
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		int m1rows = a.length;
		int m1cols = a[0].length;
		int m2cols = b[0].length;

		double[][] result = new double[m1rows][m2cols];
		for (int i = 0; i < m1rows; i++)
			for (int j = 0; j < m2cols; j++)
				for (int k = 0; k < m1cols; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
		System.out.println(" The multiplicitaon of the matrices is:");
		printMatrix(result);
		return result;
	}
	public static void printMatrix(double[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
	
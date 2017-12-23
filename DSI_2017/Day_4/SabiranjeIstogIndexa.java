package day_4;

public class SabiranjeIstogIndexa {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		double[][]a = new double[3][3];
		double[][]b = new double[3][3];
		
		System.out.print(" Unesite prvi 2D niz:");

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				a[row][col] = in.nextDouble();

			}
		}
		System.out.print(" Unesite drugi 2D niz:");

		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[0].length; col++) {
				b[row][col] = in.nextDouble();
			}
		}
	
			double[][] c = addMatrix(a, b);
			for (int i = 0; i < 3; i++) {
				for (int  j = 0; j < 3; j++) {
				
					System.out.format(" Suma dva indexa iznosi:%.2f \n", c[i][j]);
				}
			}
			in.close();
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];

		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[0].length; col++) {
				c[row][col] = a[row][col] + b[row][col];
			}
		}
		return c;

	}

}

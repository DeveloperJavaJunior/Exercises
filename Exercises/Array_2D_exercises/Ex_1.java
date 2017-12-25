package array_2D_exercises;

/**
 * 
 * Napisati metodu koja izraèunava sumu negativnih elemenata matrice koristeæi
 * se sljedeæim headerom public static int sum(int[][] m). Napisati test program
 * koji pita korisnika da unese broj redova i kolona matrice, zatim i elemente
 * matrice te mu ispiše sumu negativnih elemenata pozivajuæi metodu sum.
 *
 */

public class Ex_1 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Unesite broj redova: ");
		int row = in.nextInt();

		System.out.print(" Unesite broj kolona: ");
		int col = in.nextInt();

		int[][] m = new int[row][col];

		System.out.printf(" Unesite %d X %d niz: \n", row, col);

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				m[r][c] = in.nextInt();
			}
		}
		in.close();
		System.out.println(" Suma negativnih elemenata:" + sum(m));
	}

	public static int sum(int[][] m) {

		int sum = 0;

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				if (m[r][c] < 0) {
					sum += m[r][c];
				}
			}
		}
		return sum;
	}
}

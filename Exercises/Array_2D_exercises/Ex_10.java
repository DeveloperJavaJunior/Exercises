package array_2D_exercises;

/**
 * Napisati program koji uèitava nxn matricu od korisnika, ispisuje je, a zatim
 * mijenja mjesta najmanjem i najveæem elementu matrice i ponovo je ispisuje
 */

public class Ex_10 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Unesite duzinu broj redova matrice: ");
		int row = in.nextInt();

		System.out.print(" Unesite duzinu broj kolona matrice: ");
		int col = in.nextInt();

		int[][] m = new int[row][col];

		System.out.printf(" Unesite %d X %d matricu: \n", row, col);

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				m[r][c] = in.nextInt();
			}
		}
		in.close();

		int rowMin = 0;
		int colMin = 0;
		int min = m[rowMin][colMin];

		int rowMax = 0;
		int colMax = 0;
		int max = m[rowMax][colMax];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < min) {
					min = m[i][j];
					rowMin = i;
					colMin = j;
				}
				if (m[i][j] > max) {
					max = m[i][j];
					rowMax = i;
					colMax = j;
				}
			}
		}

		int temp = m[rowMax][colMax];
		m[rowMax][colMax] = m[rowMin][colMin];
		m[rowMin][colMin] = temp;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}

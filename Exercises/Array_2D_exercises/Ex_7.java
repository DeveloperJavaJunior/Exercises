package array_2D_exercises;

/**
 * Napisati program koji pita korisnika da unese dužinu kvadratne matrice, a
 * zatim i njene elemente. Program treba prebrojati i ispisati koliko ima
 * parnih, a koliko neparnih elemenata u glavnoj dijagonali matrice.
 * 
 */

public class Ex_7 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Unesite duzinu kvadratne matrice: ");
		int length = in.nextInt();

		int[][] m = new int[length][length];

		System.out.printf(" Unesite %d X %d matricu: \n", length, length);

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				m[r][c] = in.nextInt();
			}
		}
		in.close();

		System.out.println(elementMainDiagonalEven(m));
		System.out.println(elementMainDiagonalOdd(m));

	}

	public static int[] elementMainDiagonal(int[][] m) {

		int[] n = new int[m.length];

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				if (r == c) {
					n[r] = m[r][c];
				}

			}
		}
		return n;

	}

	public static int elementMainDiagonalEven(int[][] m) {

		int count = 0;
		int[] n = elementMainDiagonal(m);

		for (int a : n) {
			if (a % 2 == 0) {
				count++;
			}
		}
		return count;

	}
	public static int elementMainDiagonalOdd(int[][] m) {
		
		int count = 0;
		int[] n = elementMainDiagonal(m);
		
		for (int a : n) {
			if (a % 2 != 0) {
				count++;
			}
		}
		return count;
		
	}
}

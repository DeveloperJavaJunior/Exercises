package array_2D_exercises;

/**
 * Napisati program koji pita korisnika da unese elemente u 3x3 matricu, a zatim
 * prebrojava i ispisuje koliko ima elemenata veæih od 3. Napisati metodu public
 * static int countGreaterThan3(int[][] matrix) koja prebrojava i vraæa koliko
 * ima elemenata vecih od 3 u proslijedjenoj matrici.
 */

public class Ex_3 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		int[][] m = new int[3][3];

		System.out.printf(" Unesite 3 X 3 niz: \n");

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				m[r][c] = in.nextInt();
			}
		}
		in.close();
		boolean con = countGreatherThan3(m) > 0;
		System.out.println(" Elemenata u nizu vecih od 3" + (con?" ima " + countGreatherThan3(m): " nema") );
	}

	public static int countGreatherThan3(int[][] m) {

		int count = 0;

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				if (m[r][c] > 3) {
					count++;
				}
			}
		}
		return count;
	}
}

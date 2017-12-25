package array_2D_exercises;

/**
 * Napisati program koji pita korisnika da unese broj redova i kolona matrice, a
 * zatim generiše tu matricu sa random dvocifrenim brojevima, ispisuje matricu i
 * ispisuje sumu neparnih elemenata.
 * 
 *
 */

public class Ex_2 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Unesite broj redova: ");
		int row = in.nextInt();

		System.out.print(" Unesite broj kolona: ");
		int col = in.nextInt();

		int[][] m = new int[row][col];

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				m[r][c] = (int) (Math.random() * 90 + 10);
			}
		}
	

	in.close();
	printRandomMatrix(m);
	System.out.println();
	System.out.println(" Suma neparnih elemenata:" + sumOddElement(m));

	}

	public static void printRandomMatrix(int[][] m) {

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				System.out.print(m[r][c] + " ");
			}
			System.out.println();
		}

	}

	public static int sumOddElement(int[][] m) {
		int sum = 0;
		
		
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
		if(m[r][c] % 2 != 0){
			sum += m[r][c];
	
}}}
		return sum;
	}}

package array_2D_exercises;

/**
 * Napisati program koji generiše random jednocifrenu 5x5 matricu, ispisuje tu
 * matricu, a zatim izraèunava i ispisuje sumu elemenata na sporednoj
 * dijagonali.
 */

public class Ex_6 {

	public static void main(String[] args) {
int[][] m = new int[5][5];

		

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				m[r][c] = (int) (Math.random() * 9 + 1);
			}
		}
		System.out.println("Matrix: ");
		
		printMatrix(m);
		System.out.println();
		System.out.println("Proizvod elemenata sporedne dijagonale: " + sumOtherDiagonal(m));
	}
	
	public static void printMatrix(int[][] m) {
		
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				System.out.print(m[r][c] + " ");
			}
			System.out.println();
			}
		
		
	}
	public static int sumOtherDiagonal(int[][] m){
		
		int sum = 0;
		int index = m.length - 1;

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				if(r + c == index){
				sum += m[r][c];
				}
			}}
		
		return sum;
		
	}
	}


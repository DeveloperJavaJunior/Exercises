package array_2D_exercises;

/**
 * Napisati metodu koja izraèunava proizvod elemenata 2D niza koji se nalaze
 * ispod glavne dijagonale. Metoda ima sledeæi header: public static int
 * productBelowMainDiagonal(int[][] m) Napisati test program koji generiše
 * random jednocifrenu 4x4 matricu i ispisuje proizvod elemenata koji se nalaze
 * ispod glavne dijagonale.
 */

public class Ex_5 {

	public static void main(String[] args) {
		int[][] m = new int[4][4];

		

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				m[r][c] = (int) (Math.random() * 9 + 1);
			}
		}
		System.out.println("Matrix: ");
		
		printMatrix(m);
		System.out.println();
		System.out.println("Proizvod elemenata ispod glavne dijagonale: " + productBelowMainDiagonal(m));
	}
	
	public static void printMatrix(int[][] m) {
		
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				System.out.print(m[r][c] + " ");
			}
			System.out.println();
			}
		
		
	}
public static int productBelowMainDiagonal(int[][] m) {
	int pro = 1;

	for (int r = 0; r < m.length; r++) {
		for (int c = 0; c < m[r].length; c++) {
			if(r > c){
			pro *= m[r][c];
			}
		}}
	
	return pro;
	
}

}


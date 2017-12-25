package array_2D_exercises;

/**
 * Napisati metodu koja izraèunava sumu elemenata 2D niza koji se nalaze iznad
 * glavne dijagonale. Metoda ima sledeæi header: public static int
 * sumAboveMainDiagonal(int[][] m) Napisati test program koji traži od korisnika
 * da unese elemente u 4x4 matricu i ispisuje sumu elemenata koji se nalaze
 * iznad glavne dijagonale.
 */

public class Ex_4 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		int[][] m = new int[4][4];

		System.out.printf(" Unesite 4 X 4 niz: \n");

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				m[r][c] = in.nextInt();
			}
		}
		in.close();
		
		System.out.println(sumAboveMainDiagonal(m));

	}
public static int sumAboveMainDiagonal(int[][] m){
	
	int sum = 0;

	for (int r = 0; r < m.length; r++) {
		for (int c = 0; c < m[0].length; c++) {
			if(r >= c){
			sum += m[r][c];
			}
		}}
	
	return sum;
	
}
}

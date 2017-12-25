package array_2D_exercises;

/**
 * Napisati program koji pita korisnika da unese dužinu kvadratne matrice i
 * njene elemente te izraèunava i ispisuje u kojem je redu najmanja aritmetièka
 * sredina elemenata.
 * 
 */

public class Ex_8 {

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
		
		largestAverageRow(m);
		
	}
public static int sumRow(int[][] m, int row) {
	
	int sum = 0;
	
	for (int r = 0; r < m[0].length; r++) {
		sum += m[row][r];
	}
	return sum;
	
	
}
public static void largestAverageRow(int[][] m) {
	
	int row = 0, max = 0;
	int a = sumRow(m,row);
	double average = a / m.length;
	
	for (int r = 0; r < m.length; r++) {
		if(average < row){
			max = row;
			System.out.println(" Najveci red sa aaitmetickom sredinom je " + max);
		}
}
	
	
	
	
}
}
/**
for(int row = 0; row < matrix.length; row++){

input.close();
System.out.println(" Sum of the elements at row " + row + " is " + sumRow(matrix,row));
}
}
public static double sumRow(double[][] m,int rowIndex) {
double sumRow = 0;

for(int row = 0; row < m[0].length; row++){
	sumRow += m[rowIndex][row];
}
return sumRow;
}

}*/
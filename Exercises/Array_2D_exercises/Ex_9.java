package array_2D_exercises;

/**
 * Napisati program koji pita korisnika da unese dužinu kvadratne matrice i
 * njene elemente te izraèunava i ispisuje u kojoj je koloni najveæa aritmetièka
 * sredina elemenata.
 */

public class Ex_9 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Unesite duzinu kvadratne matrice: ");
		int length = in.nextInt();
		
		int[][] m = new int[length][length];

		System.out.printf(" Unesite %d X %d matricu: \n",length,length);

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				m[r][c] = in.nextInt();
			}
		}
		in.close();


		int indexOfColumn = 0;
		double minAverage = Integer.MAX_VALUE;
		for (int i = 0; i < m.length; i++) {
			double sumByColumn = 0;
			for (int j = 0; j < m[i].length; j++) {
				sumByColumn += m[j][i];
			}

			double average = sumByColumn / m[i].length;

			System.out.println(average);
			if (average < minAverage) {
				minAverage = average;
				indexOfColumn = i;
			}
		}

		System.out.println("Indeks kolone sa najmanjom aritmetickom sredinom: "
				+ indexOfColumn);
	}

}




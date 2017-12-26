public class Task14ExploreMatrix {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter the size for the matrix:");

		int size = input.nextInt();
		int[][] m = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				m[i][j] = (int) (Math.random() * 2);
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		boolean letitbe;
		int j;

		boolean row = false, col = false, major = false, sub = false;
		for (int i = 0; i < size; i++) {
			letitbe = true;
			for (j = 0; j < size - 1; j++) {
				if (m[i][j] != m[i][j + 1])
					letitbe = false;
			}
			if (letitbe) {
				System.out.println("All " + m[i][j] + "s on row " + i);
				row = true;
			}
		}
		for (int i = 0; i < size; i++) {
			letitbe = true;
			for (j = 0; j < size - 1; j++) {
				if (m[j][i] != m[j + 1][i])
					letitbe = false;
			}
			if (letitbe) {
				System.out.println("All " + m[j][i] + "s on column " + i);
				col = true;
			}
		}

		letitbe = true;
		for (int i = 0; i < size - 1; i++) {
			if (m[i][i] != m[i + 1][i + 1])
				letitbe = false;
		}
		if (letitbe) {
			System.out.println("All " + m[0][0] + "s on major diagonal");
			major = true;
		}

		letitbe = true;
		for (int i = 0; i < size - 1; i++) {
			if (m[i][size - i - 1] != m[i + 1][size - i - 1 - 1])
				letitbe = false;
		}
		if (letitbe) {
			System.out.println("All " + m[0][size - 1] + "s on sub-diagonal");
			sub = true;
		}
		 if (row == false){
			System.out.println("No same numbers on a row");
		 }
		if (col == false){
				System.out.println("No same numbers on a column");
		}
		 if (major == false){
			System.out.println("No same numbers on the major diagonal");
		}
		 if (sub == false){
			System.out.println("No same numbers on the sub-diagonal");
		}
	}
}
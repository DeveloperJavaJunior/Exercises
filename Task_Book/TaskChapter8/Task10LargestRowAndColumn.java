public class Task10LargestRowAndColumn {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter a 4-by-4 matrix row by row(enter 0 and 1):");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
		input.close();
		System.out.println(" The largest row index:" + largestRow(matrix));
		System.out.println(" The largest column index:" + largestColumn(matrix));
	}

	public static int largestRow(int[][] m) {
		int row = 0;
		int sumMax = 0;
		
		for (int j = 0; j < m[0].length; j++){
			sumMax += m[0][j];
		}
			for (int i = 1; i < m.length; i++) {
			int sum = 0;
			for (int j = 0; j < m[0].length; j++)
				sum += m[i][j];
			if (sum > sumMax) {
				sumMax = sum;
				row = i;
			}
		}
		return row;
	}
	public static int largestColumn(int[][] m) {
		int col=0;
		int sumMax=0;
		
		for(int i=0; i<m.length; i++){
		sumMax += m[i][0];
		}
		for(int j = 1; j < m[0].length; j++){
		int sum = 0;
		for(int i = 0; i < m.length; i++)
		sum += m [i][j];
		if(sum > sumMax){
		sumMax = sum;
		col = j;

		}
	}
		return col;
	}	

}

public class Task_Ex_SumRow {

	public static void main(String[] args) {
		double[][] matrix = new double[3][4];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter a 3-by-4 matrix row by row:");
		
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[0].length; col++){
				matrix[row][col] = input.nextDouble();
			}
		}
		
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

}

	

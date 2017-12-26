
public class Task1SumElementsColumnByColumnSecondMethod {
	
	public static double sumColumn(double[][] m,int columnIndex) {
		double sumColumn = 0;
		
		for(int row = 0; row < m.length; row++){
			sumColumn += m[row][columnIndex];
		}
		return sumColumn;
	}
	public static void main(String[] args) {
		double[][] matrix = new double[3][4];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter a 3-by-4 matrix row by row:");
		
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[0].length; col++){
				matrix[row][col] = input.nextDouble();
			}
		}
		for(int col = 0; col < matrix[0].length; col++){
			
		input.close();
		System.out.println(" Sum of the elements at column" + col + " is " + sumColumn(matrix,col));
		}
	}
}
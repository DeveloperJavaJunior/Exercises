public class Task13LocateLargestElement {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter the number of rows and columns of the array:");

		int row = input.nextInt();
		int col = input.nextInt();

		double[][] array = new double[row][col];
		System.out.print(" Enter the array:");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = input.nextDouble();
			}

		}
		input.close();
		System.out.println(" The location of the largest element is at " + locateLargest(array));
	}

	public static int[] locateLargest(double[][] a) {
		int[] locateLargest = new int[2];
		double max = a[0][0];
		
		int maxRow = 0;
		int maxCol = 0;

		for (int row = 0; row < a.length; row++) {
			for (int col= 0; col < a[0].length; col++) {

				if (a[row][col] > max) {
					max = a[row][col];
					
				
			}
		}

	}
		return locateLargest;
	}
}
